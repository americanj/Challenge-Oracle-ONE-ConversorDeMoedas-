
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author igor
 */
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class App {

    public static void main(String[] args) throws Exception {

        boolean verificadora = false;

        JPanel panel = new JPanel(new GridBagLayout());

        Object[] opcao = {"Conversor de moeda", "Conversor de Temperatura(Em desenvolvimento)"};
        Object[] opcaoMoedas = {"Dólar", "Euro"};

        JComboBox comboBox = new JComboBox(opcao);
        JComboBox comboMoedas = new JComboBox(opcaoMoedas);

        comboBox.setSelectedIndex(0);

        JOptionPane.showMessageDialog(null, "Olá bem vindo!");
        JOptionPane.showMessageDialog(null, "Vamos começar a conversão?");
        JOptionPane.showMessageDialog(null, comboBox);

        do {
            if (comboBox.getSelectedIndex() == 0) {
                String numero = JOptionPane.showInputDialog("Digite um valor");

                double valorParseado = Double.parseDouble(numero);

                JOptionPane.showMessageDialog(null, "Selecione o tipo de conversão");

                JOptionPane.showMessageDialog(null, comboMoedas);

                if (comboMoedas.getSelectedIndex() == 0) {
                    System.out.println("dolar");
                    JOptionPane.showMessageDialog(null, "o valor da conversão é R$ " + calcularDolar(valorParseado));

                } else if (comboMoedas.getSelectedIndex() == 1) {
                    System.out.println("euro");
                    JOptionPane.showMessageDialog(null, "o valor da conversão é R$ " + calcularEuro(valorParseado));
                }

                int confirma = JOptionPane.showConfirmDialog(null, "Deseja continuar ?");

                switch (confirma) {
                    case 0:
                        verificadora = true;
                        break;
                    case 1:
                        verificadora = false;
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        break;
                    case 2:
                        verificadora = false;
                        JOptionPane.showMessageDialog(null, "Programa concluído");
                        System.out.println("outro");
                        break;
                }

                panel.add(comboBox);
                panel.add(comboMoedas);

            } else {
                JOptionPane.showMessageDialog(null, "Desculpe tente novamente");
            }

        } while (verificadora);

    }

    static double calcularDolar(double real) {
        double dolar = 0.19;
        return real * dolar;
    }

    static double calcularEuro(double real) {
        double euro = 0.20;
        return real * euro;
    }
}

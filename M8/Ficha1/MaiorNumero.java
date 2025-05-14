package M8.Ficha1;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MaiorNumero {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Maior Número");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Digite um número inteiro:");
        JTextField input = new JTextField(10);
        JButton checkButton = new JButton("Verificar");
        JButton clearButton = new JButton("Limpar");
        JLabel resultLabel = new JLabel("Maior número: -");

        int[] maior = {Integer.MIN_VALUE}; // Inicializa com o menor valor possível

        checkButton.addActionListener(e -> {
            try {
                int num = Integer.parseInt(input.getText());
                if (num > maior[0]) {
                    maior[0] = num;
                    resultLabel.setText("Maior número: " + maior[0]);
                }
                input.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Por favor, digite um número inteiro válido!");
            }
        });

        clearButton.addActionListener(e -> {
            maior[0] = Integer.MIN_VALUE;
            resultLabel.setText("Maior número: -");
            input.setText("");
        });

        frame.add(label);
        frame.add(input);
        frame.add(checkButton);
        frame.add(clearButton);
        frame.add(resultLabel);
        frame.setVisible(true);
    }
}
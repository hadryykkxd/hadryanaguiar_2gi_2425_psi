package M8.Ficha1;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SomaNumeros {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Soma de Números");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Digite um número inteiro:");
        JTextField input = new JTextField(10);
        JButton addButton = new JButton("Adicionar");
        JButton clearButton = new JButton("Limpar");
        JLabel resultLabel = new JLabel("Soma: 0");

        int[] soma = {0}; // Usamos array para simular "passagem por referência"

        addButton.addActionListener(e -> {
            try {
                int num = Integer.parseInt(input.getText());
                soma[0] += num;
                resultLabel.setText("Soma: " + soma[0]);
                input.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Por favor, digite um número inteiro válido!");
            }
        });

        clearButton.addActionListener(e -> {
            soma[0] = 0;
            resultLabel.setText("Soma: 0");
            input.setText("");
        });

        frame.add(label);
        frame.add(input);
        frame.add(addButton);
        frame.add(clearButton);
        frame.add(resultLabel);
        frame.setVisible(true);
    }
}

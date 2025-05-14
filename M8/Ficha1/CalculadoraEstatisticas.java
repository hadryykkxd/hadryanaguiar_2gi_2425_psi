package M8.Ficha1;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CalculadoraEstatisticas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora Estatísticas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Digite um número inteiro:");
        JTextField input = new JTextField(10);
        JButton calcButton = new JButton("Calcular");
        JButton clearButton = new JButton("Limpar");
        JLabel mediaLabel = new JLabel("Média: 0");
        JLabel maiorLabel = new JLabel("Maior: -");
        JLabel menorLabel = new JLabel("Menor: -");

        List<Integer> numeros = new ArrayList<>();

        calcButton.addActionListener(e -> {
            try {
                int num = Integer.parseInt(input.getText());
                numeros.add(num);

                int soma = numeros.stream().mapToInt(Integer::intValue).sum();
                double media = (double) soma / numeros.size();
                int maior = numeros.stream().max(Integer::compare).get();
                int menor = numeros.stream().min(Integer::compare).get();

                mediaLabel.setText(String.format("Média: %.2f", media));
                maiorLabel.setText("Maior: " + maior);
                menorLabel.setText("Menor: " + menor);
                input.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Por favor, digite um número inteiro válido!");
            }
        });

        clearButton.addActionListener(e -> {
            numeros.clear();
            mediaLabel.setText("Média: 0");
            maiorLabel.setText("Maior: -");
            menorLabel.setText("Menor: -");
            input.setText("");
        });

        frame.add(label);
        frame.add(input);
        frame.add(calcButton);
        frame.add(clearButton);
        frame.add(mediaLabel);
        frame.add(maiorLabel);
        frame.add(menorLabel);
        frame.setVisible(true);
    }
}

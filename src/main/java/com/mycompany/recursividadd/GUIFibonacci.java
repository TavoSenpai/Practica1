
package com.mycompany.recursividadd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;



public class GUIFibonacci extends JFrame {

    private JTextField lengthField;
    private JTextArea resultArea;

    public GUIFibonacci() {
        setTitle("Serie Fibonacci");
        setSize(400, 300);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        lengthField = new JTextField(10);
        JButton generateButton = new JButton("Generar");

        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = lengthField.getText();
                if (validacionFibonacci(input)) {
                    int length = Integer.parseInt(input);
                    int[] series = FibonacciLogica.generarFibonacci(length);
                    resultArea.setText(Arrays.toString(series));
                } else {
                    JOptionPane.showMessageDialog(GUIFibonacci.this, "Ingrese una longitud válida (número positivo).", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        inputPanel.add(new JLabel("Longitud:"));
        inputPanel.add(lengthField);
        inputPanel.add(generateButton);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        setLocationRelativeTo(null);
    }
//Validaciones
    private boolean validacionFibonacci(String input) {
        if (input == null || input.trim().isEmpty()) {
            return false;
        }
        try {
            int length = Integer.parseInt(input);
            return length > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
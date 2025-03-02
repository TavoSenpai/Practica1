package com.mycompany.recursividadd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIHanoi extends JFrame {

    private JTextField campoDiscos;
    private JTextArea areaRes;

    public GUIHanoi() {
        setTitle("Torres de Hanói");
        setSize(400, 300);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        campoDiscos = new JTextField(10);
        JButton solveButton = new JButton("Resolver");

        areaRes = new JTextArea();
        areaRes.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(areaRes);

        solveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = campoDiscos.getText();
                if (validacionHanoi(input)) {
                    int numDiscos = Integer.parseInt(input);
                    HanoiLogica hanoiLogica = new HanoiLogica(numDiscos);
                    areaRes.setText(hanoiLogica.resolverHanoi());
                } else {
                    JOptionPane.showMessageDialog(GUIHanoi.this, "Ingrese un número de discos válido (1-10).", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        inputPanel.add(new JLabel("Discos:"));
        inputPanel.add(campoDiscos);
        inputPanel.add(solveButton);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        setLocationRelativeTo(null);
    }

    private boolean validacionHanoi(String input) {
        if (input == null || input.trim().isEmpty()) {
            return false;
        }
        try {
            int discos = Integer.parseInt(input);
            return discos > 0 && discos <= 10;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
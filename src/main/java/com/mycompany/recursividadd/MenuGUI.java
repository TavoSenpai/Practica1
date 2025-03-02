
package com.mycompany.recursividadd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuGUI extends JFrame {

    public MenuGUI() {
        setTitle("Menú Principal");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton Botonfibonacci = new JButton("Serie Fibonacci");
        JButton Botonhanoi = new JButton("Torres de Hanói");

        Botonfibonacci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUIFibonacci fibonacciGUI = new GUIFibonacci();
                fibonacciGUI.setVisible(true);
            }
        });

        Botonhanoi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUIHanoi hanoiGUI = new GUIHanoi();
                hanoiGUI.setVisible(true);
            }
        });

        add(Botonfibonacci);
        add(Botonhanoi);
        setLocationRelativeTo(null);
    }
}
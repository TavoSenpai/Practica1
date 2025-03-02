
package com.mycompany.recursividadd;

import javax.swing.SwingUtilities;




public class Recursividadd {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MenuGUI menu = new MenuGUI();
            menu.setVisible(true);
        });

    }
}

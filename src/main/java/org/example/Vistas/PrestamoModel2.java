package org.example.Vistas;

import javax.swing.*;

public class PrestamoModel2 extends JDialog{
    private JTextField txtSelecLibro;
    private JTextField txtSiNo;
    private JPanel panel4;
    private JButton buttonVolver;

    public PrestamoModel2 (){
        setContentPane(panel4);
        setModal(true);
        setSize(800, 600);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args){
        PrestamoModel2 dialog = new PrestamoModel2();
        dialog.setVisible(true);
    }
}

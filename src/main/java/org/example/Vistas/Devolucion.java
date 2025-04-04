package org.example.Vistas;

import javax.swing.*;

public class Devolucion extends JDialog{
    private JTextField txtSelecLibro;
    private JTextField txtSiNo;
    private JPanel panel3;
    private JButton buttonVolver;

    public Devolucion (){
        setContentPane(panel3);
        setModal(true);
        setSize(800, 600);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args){
        Devolucion dialog = new Devolucion();
        dialog.setVisible(true);
    }
}

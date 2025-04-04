package org.example.Vistas;

import javax.swing.*;

public class LibroModel2 extends JDialog{
    private JPanel panel1;
    private JButton buttonAgregarLibro;
    private JTextField txtNombreLibro;
    private JTable table1;
    private JButton buttonVolver;


    public LibroModel2 (){
        setContentPane(panel1);
        setModal(true);
        setSize(800, 600);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args){
        LibroModel2 dialog = new LibroModel2();
        dialog.setVisible(true);
    }
}







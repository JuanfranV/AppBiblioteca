package org.example.Vistas;

import javax.swing.*;

public class Accion extends JDialog{
    private JButton buttonVerAgragarLibros;
    private JButton buttonPrestamo;
    private JButton buttonDevolucion;
    private JPanel panel2;

    public Accion (){
        setContentPane(panel2);
        setModal(true);
        setSize(800, 600);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args){
        Accion dialog = new Accion();
        dialog.setVisible(true);
    }


}

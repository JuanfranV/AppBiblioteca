package org.example.Vistas;

import org.example.Modelos.PrestamoModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Accion extends JDialog{
    private JButton buttonVerAgragarLibros;
    private JButton buttonPrestamo;
    private JButton buttonDevolucion;
    private JPanel panel2;



    public Accion (){


        setContentPane(panel2);
        setSize(800, 600);
        setLocationRelativeTo(null);


        buttonVerAgragarLibros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LibroModel2 volverMenu= new LibroModel2();
                volverMenu.setVisible(true);
                setVisible(false);
            }
        });
        buttonPrestamo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrestamoModel2 volverMenu= new PrestamoModel2();
                volverMenu.setVisible(true);
                setVisible(false);
            }
        });
        buttonDevolucion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Devolucion volverMenu= new Devolucion();
                volverMenu.setVisible(true);
                setVisible(false);
            }
        });
    }

    public static void main(String[] args){
        Accion dialog = new Accion();
        dialog.setVisible(true);
    }


}

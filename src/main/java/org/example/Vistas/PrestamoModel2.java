package org.example.Vistas;

import org.example.Modelos.LibroModel;
import org.example.Modelos.PrestamoModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PrestamoModel2 extends JDialog{
    private JTextField txtSelecLibro;
    private JPanel panel4;
    private JButton buttonVolver;
    private JTable table1;
    private JButton buttonListar;
    private JButton buttonSelecLibro;
    private JLabel labelNombre;
    private JLabel labelExistencia;
    private JButton buttonSi;
    private JButton buttonNo;
    private JLabel labelPrestados;
    private JLabel labelDatos;
    LibroModel libro = new LibroModel();
    PrestamoModel prestamo = new PrestamoModel();

    public PrestamoModel2 (){
        setContentPane(panel4);
        setModal(true);
        setSize(800, 600);
        setLocationRelativeTo(null);

        buttonListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("N°");
                model.addColumn("Nombre");
                model.addColumn("Existencia");

                if (libro.listarLibros() != null){
                    int numeroFila = 1;
                    for (LibroModel fila: libro.listarLibros()){
                        model.addRow(new Object[]{
                                numeroFila++,
                                fila.getNombre(),
                                fila.getCantidad()
                        });
                    }
                }
                table1.setModel(model);
            }
        });


        buttonSelecLibro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numeroFila = Integer.parseInt(txtSelecLibro.getText());

                if (numeroFila > 0) {
                    table1.setRowSelectionInterval(numeroFila - 1, numeroFila - 1);

                    String nombre = (String) table1.getValueAt(numeroFila - 1, 1);
                    int existencia = (int) table1.getValueAt(numeroFila - 1, 2);

                    labelNombre.setText("Nombre: " + nombre);
                    labelExistencia.setText("Existencia: " + existencia);
                    labelPrestados.setText("Prestados:  " + prestamo.getNumeroPrestados());
                }

            }
        });
        buttonVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Accion volverMenu= new Accion();
                volverMenu.setVisible(true);
                dispose();
            }
        });


        buttonSi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (prestamo.getNumeroPrestados() == libro.getCantidad()){
                    JOptionPane.showMessageDialog(null, "No se realizó el prestamo, ya no hay en existencia", "sistema", JOptionPane.INFORMATION_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(null, "se realizó el prestamo", "sistema", JOptionPane.INFORMATION_MESSAGE);
                    prestamo.prestamos();
                }

            }
        });
        buttonNo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "No se realizó el prestamo", "sistema", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args){
        PrestamoModel2 dialog = new PrestamoModel2();
        dialog.setVisible(true);

    }
}

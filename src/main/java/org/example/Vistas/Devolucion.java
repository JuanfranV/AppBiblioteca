package org.example.Vistas;

import org.example.Modelos.DevolucionModel;
import org.example.Modelos.LibroModel;
import org.example.Modelos.PrestamoModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Devolucion extends JDialog{
    private JTextField txtSelecLibro;
    private JPanel panel3;
    private JButton buttonVolver;
    private JTable table1;
    private JButton buttonSeleccionar;
    private JLabel labelPrestados;
    private JLabel labelExistencia;
    private JLabel labelNombre;
    private JButton buttonSi;
    private JButton buttonNo;
    private JButton buttonListar;
    LibroModel libro = new LibroModel();
    PrestamoModel prestamo = new PrestamoModel();
    DevolucionModel devolucion = new DevolucionModel();



    public Devolucion (){
        setContentPane(panel3);
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

        buttonSeleccionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numeroFila = Integer.parseInt(txtSelecLibro.getText());
                if (numeroFila > 0) {
                    table1.setRowSelectionInterval(numeroFila - 1, numeroFila - 1);

                    String nombre = (String) table1.getValueAt(numeroFila - 1, 1);
                    int existencia = (int) table1.getValueAt(numeroFila - 1, 2);

                    labelNombre.setText("Nombre: " + nombre);
                    labelExistencia.setText("Existencia: " + existencia);
                    labelPrestados.setText("Prestados: " + prestamo.getNumeroPrestados());
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
                if (prestamo.getNumeroPrestados() == 0){
                    JOptionPane.showMessageDialog(null, "No se realizó la devolución, no hay libros prestados", "sistema", JOptionPane.INFORMATION_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(null, "se realizó la devolución", "sistema", JOptionPane.INFORMATION_MESSAGE);
                    devolucion.devolucion();
                }
            }
        });

        buttonNo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "No se realizó la devolución", "sistema", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args){
        Devolucion dialog = new Devolucion();
        dialog.setVisible(true);
    }
}

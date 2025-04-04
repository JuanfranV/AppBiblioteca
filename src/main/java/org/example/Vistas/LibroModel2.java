package org.example.Vistas;

import org.example.Modelos.LibroModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibroModel2 extends JDialog{
    private JPanel panel1;
    private JButton buttonAgregarLibro;
    private JTextField txtNombreLibro;
    private JTable table1;
    private JButton buttonVolver;
    private LibroModel libro = new LibroModel();

    public LibroModel2 (){
        setContentPane(panel1);
        setModal(true);
        setSize(800, 600);
        setLocationRelativeTo(null);

        buttonAgregarLibro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                libro = new LibroModel();
                libro.setNombre(txtNombreLibro.getText());
                libro.agregarLibro(libro);

                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Nombre");
                model.addColumn("Existencia");

                if (libro.listarLibros() != null){
                    for (LibroModel fila: libro.listarLibros()){
                        model.addRow(new Object[]{
                            fila.getNombre(),
                            fila.getCantidad()
                        });
                    }
                }

                table1.setModel(model);
                JOptionPane.showMessageDialog(null, "El libro se agregó con exito", "sistema", JOptionPane.INFORMATION_MESSAGE);
                txtNombreLibro.setText("");
            }
        });
    }

    public static void main(String[] args){
        LibroModel2 dialog = new LibroModel2();
        dialog.setVisible(true);
    }
}







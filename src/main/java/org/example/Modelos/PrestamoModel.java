package org.example.Modelos;

import java.util.Date;

public class PrestamoModel extends LibroModel {

    private Date fecha;
    private int numLibro;
    private String siNO;


    public PrestamoModel(Date fecha, int numLibro, String siNO) {
        this.fecha = fecha;
        this.numLibro = numLibro;
        this.siNO = siNO;
    }

    public PrestamoModel() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumLibro() {
        return numLibro;
    }

    public void setNumLibro(int numLibro) {
        this.numLibro = numLibro;
    }

    public String getSiNO() {
        return siNO;
    }

    public void setSiNO(String siNO) {
        this.siNO = siNO;
    }

    public void seleccionarLibro() {
        System.out.println("Seleccione un libro (1, 2, 3...)");

        for (int i = 0; i < listarLibros().size(); i++) {
            System.out.println((i + 1) + ". " + "x" + listarCantidad().get(i) + " " + listarLibros().get(i));
        }

        numLibro = scanner.nextInt();

    }

    public void mostrarLibro(int numLibro) {

        System.out.println("El nombre del libro es: " + listarLibros().get(numLibro - 1));
        System.out.println("En existencia: " + listarCantidad().get(numLibro - 1));
    }

    public String prestamos(int numLibro){

        System.out.println("¿Desea realizar el prestamo? Si/No");
        siNO = scanner.nextLine().toUpperCase();






        return "Se completó";
    }
}




package org.example.Modelos;

import java.util.Date;

public class PrestamoModel extends LibroModel {


    private int numeroPrestados;
    private Date fecha;
    private int numLibro;
    private String siNO;
    private int libroSeleccionado;


    public PrestamoModel(Date fecha, int numLibro, String siNO, int numeroPrestados, int libroSeleccionado) {
        this.fecha = fecha;
        this.numLibro = numLibro;
        this.siNO = siNO;
        this.numeroPrestados = numeroPrestados;
        this.libroSeleccionado = libroSeleccionado;
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

    public int getNumeroPrestados() {
        return numeroPrestados;
    }

    public void setNumeroPrestados(int numeroPrestados) {
        this.numeroPrestados = numeroPrestados;
    }

    public int getLibroSeleccionado() {
        return libroSeleccionado;
    }

    public void setLibroSeleccionado(int libroSeleccionado) {
        this.libroSeleccionado = libroSeleccionado;
    }

    public void seleccionarLibro () {
        System.out.println("Seleccione un libro (1, 2, 3...)");

        for (libroSeleccionado = 0; libroSeleccionado < listarLibros().size(); libroSeleccionado++) {
            System.out.println((libroSeleccionado + 1) + ". " + "x" + listarCantidad().get(libroSeleccionado) + " " + listarLibros().get(libroSeleccionado));
        }

        numLibro = scanner.nextInt();

    }

    public void mostrarLibro(int numLibro) {

        System.out.println("El nombre del libro es: " + listarLibros().get(numLibro - 1));
        System.out.println("En existencia: " + listarCantidad().get(numLibro - 1));
        System.out.println("Se han prestado: x" + numeroPrestados);



    }

    public String prestamos(){

        System.out.println("¿Desea realizar el prestamo? Si/No");
        siNO = scanner.nextLine().toUpperCase();

        if (numeroPrestados == cantidadLibro.getCantidad()){
            System.out.println("No hay disponibles para prestar");
        }

        for (numeroPrestados = 0; siNO.equals("SI"); numeroPrestados++){}



        return "Se completó";
    }

}




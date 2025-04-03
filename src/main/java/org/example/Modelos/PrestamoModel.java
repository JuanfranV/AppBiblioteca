package org.example.Modelos;


public class PrestamoModel extends LibroModel {


    private int numeroPrestados;
    private int numLibro;
    private String siNO;
    private int libroSeleccionado;


    public PrestamoModel(int numLibro, String siNO, int numeroPrestados, int libroSeleccionado) {
        this.numLibro = numLibro;
        this.siNO = siNO;
        this.numeroPrestados = numeroPrestados;
        this.libroSeleccionado = libroSeleccionado;
    }

    public PrestamoModel() {
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
            System.out.println((libroSeleccionado + 1) + ". " + "x" + getCantidad() + " " + listarLibros().get(libroSeleccionado));
        }

        numLibro = scanner.nextInt();

    }

    public void mostrarLibro(int numLibro) {

        System.out.println("El nombre del libro es: " + listarLibros().get(numLibro - 1));
        System.out.println("En existencia: " + getCantidad());
        System.out.println("Se han prestado: x" + numeroPrestados);
    }


    public String prestamos(){

        siNO = scanner.nextLine().toUpperCase();

        if (numeroPrestados == 0){
            System.out.println("No hay disponibles para prestar");
        }

        if (siNO.equals("SI")){
            System.out.println("se realizó el prestamo");
        }

        if (siNO.equals("NO")){
            System.out.println("No se realizó el prestamo");
        }

        for (; siNO.equals("SI") && numeroPrestados < getCantidad(); numeroPrestados++){}



        return "Se completó";
    }

}




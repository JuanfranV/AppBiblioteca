package org.example.Modelos;


public class PrestamoModel extends LibroModel {

    private int numeroPrestados = 0;

    public PrestamoModel( int numeroPrestados) {
        this.numeroPrestados = numeroPrestados;
    }

    public PrestamoModel() {
    }

    public int getNumeroPrestados() {
        return numeroPrestados;
    }

    public void setNumeroPrestados(int numeroPrestados) {
        this.numeroPrestados = numeroPrestados;
    }

    public void prestamos(){
        if (numeroPrestados < getCantidad()) {
            setNumeroPrestados(numeroPrestados+ 1);
        }

    }

}




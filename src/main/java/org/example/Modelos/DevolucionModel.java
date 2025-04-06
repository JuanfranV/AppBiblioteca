package org.example.Modelos;

public class DevolucionModel extends PrestamoModel {

    private int numeroPrestadosDev;

    public DevolucionModel(int numeroPrestadosDev) {
        this.numeroPrestadosDev = numeroPrestadosDev;
    }

    public DevolucionModel() {
    }

    public int getNumeroPrestadosDev() {
        return numeroPrestadosDev;
    }

    public void setNumeroPrestadosDev(int numeroPrestadosDev) {
        this.numeroPrestadosDev = numeroPrestadosDev;
    }


    public void copiarValor(PrestamoModel valor){

    this.numeroPrestadosDev = valor.getNumeroPrestados();

    }

    public void devolucion (){


        if (numeroPrestadosDev > 0) {
            setNumeroPrestados(numeroPrestadosDev - 1);
        }

    }
}

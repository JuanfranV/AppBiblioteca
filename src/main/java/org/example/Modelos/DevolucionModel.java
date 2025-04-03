package org.example.Modelos;

public class DevolucionModel extends PrestamoModel {

    PrestamoModel prestamoModel = new PrestamoModel();

    private String siNoDev;
    private int numPrestado = getNumeroPrestados();

    public DevolucionModel(String siNoDev, int numPrestado) {
        this.siNoDev = siNoDev;
        this.numPrestado = numPrestado;
    }

    public DevolucionModel() {
    }

    public PrestamoModel getPrestamoModel() {
        return prestamoModel;
    }

    public void setPrestamoModel(PrestamoModel prestamoModel) {
        this.prestamoModel = prestamoModel;
    }

    public String getSiNoDev() {
        return siNoDev;
    }

    public void setSiNoDev(String siNoDev) {
        this.siNoDev = siNoDev;
    }

    public int getNumPrestado() {
        return numPrestado;
    }

    public void setNumPrestado(int numPrestado) {
        this.numPrestado = numPrestado;
    }

    public void selecLibrosDev (){
        prestamoModel.seleccionarLibro();
    }

    public void mostrarLibroDev (){
        prestamoModel.mostrarLibro(1);
    }

    public String devolucion (int numPrestado){

        System.out.println("¿Desea realizar el prestamo? Si/No");
        siNoDev = scanner.nextLine().toUpperCase();
        setSiNO(siNoDev);

        if (getNumeroPrestados() == getCantidad()){
            System.out.println("No se puede devolver");
        }

        if (getSiNO().equals("SI")){
            System.out.println("se realizó la devolución");
        }

        if (getSiNO().equals("NO")){
            System.out.println("No se realizó la devolución");
        }

        for (;getSiNO().equals("SI") && numPrestado > 0; numPrestado--){}



        return "se completó";
    }
}

package org.example.Modelos;

public class DevoluciónModel extends PrestamoModel {

    String devolucion;



































    public DevoluciónModel(String devolucion) {
        this.devolucion = devolucion;
    }

    public DevoluciónModel() {
    }

    public String getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(String devolucion) {
        this.devolucion = devolucion;
    }
}

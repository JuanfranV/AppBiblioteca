package org.example.Modelos;

import java.util.ArrayList;
import java.util.List;

public class LibroModel{

        private static List<LibroModel> listaLibros = new ArrayList<>();


        private String nombre;
        private int cantidad = 5;

        public LibroModel(String nombre, int cantidad) {
                this.nombre = nombre;
                this.cantidad =  cantidad;
        }

        public LibroModel() {
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public int getCantidad() {
                return cantidad;
        }

        public void setCantidad(int cantidad) {
                this.cantidad = cantidad;
        }

        public void agregarLibro(LibroModel libro) {
                listaLibros.add(libro);
        }

        public List<LibroModel> listarLibros(){
                return listaLibros;
        }





}


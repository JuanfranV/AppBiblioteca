package org.example.Modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibroModel{

        private static List<LibroModel> listaLibros = new ArrayList<>();

        static Scanner scanner = new Scanner(System.in);
        static LibroModel libro = new LibroModel();

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

        public static void agregarLibro(String nombre) {
                System.out.print("Ingrese el título del libro: ");
                nombre = scanner.nextLine();

                libro.setNombre(nombre);
                listaLibros.add(libro);

                System.out.println("Libro agregado con éxito: " + nombre);
        }

        public List<LibroModel> listarLibros(){
                return listaLibros;
        }



}


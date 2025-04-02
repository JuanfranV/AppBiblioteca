package org.example.Modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibroModel{

        private static List<LibroModel> listaLibros = new ArrayList<>();
        private static List<LibroModel> listaCantidad = new ArrayList<>();

        static Scanner scanner = new Scanner(System.in);
        static LibroModel libro = new LibroModel();
        static LibroModel cantidadLibro = new LibroModel();

        private String nombre;
        private int cantidad;

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

        public static void agregarLibro(String nombre, int cantidad) {
                System.out.print("Ingrese el título del libro: ");
                nombre = scanner.nextLine();

                System.out.println("Ingrese la cantidad en existencia: ");
                cantidad = scanner.nextInt();

                cantidadLibro.setCantidad(cantidad);
                listaCantidad.add(cantidadLibro);

                libro.setNombre(nombre);
                listaLibros.add(libro);

                System.out.println("Libro agregado con éxito: " + nombre);
        }

        public List<LibroModel> listarLibros(){
                return listaLibros;
        }

        public List<LibroModel> listarCantidad(){
                return listaCantidad;
        }


}


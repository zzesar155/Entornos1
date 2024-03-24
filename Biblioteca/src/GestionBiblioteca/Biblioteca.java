package GestionBiblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Biblioteca representa una biblioteca que contiene una lista de libros.
 * 
 * @author Autor
 * @version 1.0
 * @since 2024-03-23
 */
public class Biblioteca {
    private List<Libro> libros;

    /**
     * Constructor de la clase Biblioteca.
     */
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    /**
     * Método para agregar un libro a la biblioteca.
     * 
     * @param libro El libro a agregar.
     */
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    /**
     * Método para buscar un libro por título en la biblioteca.
     * 
     * @param titulo El título del libro a buscar.
     * @return El libro encontrado, o null si no se encuentra.
     */
    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }
}
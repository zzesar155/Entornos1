package GestionBiblioteca;

/**
 * La clase Libro representa un libro en la biblioteca.
 * 
 * @author Autor
 * @version 1.0
 * @since 2024-03-23
 */
public class Libro {
    private String titulo;
    private String autor;
    private int numPaginas;

    /**
     * Constructor de la clase Libro.
     * 
     * @param titulo     El título del libro.
     * @param autor      El autor del libro.
     * @param numPaginas El número de páginas del libro.
     */
    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    /**
     * Método para obtener el título del libro.
     * 
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Método para obtener el autor del libro.
     * 
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Método para obtener el número de páginas del libro.
     * 
     * @return El número de páginas del libro.
     */
    public int getNumPaginas() {
        return numPaginas;
    }
}

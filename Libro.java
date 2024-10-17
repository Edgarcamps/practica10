/**
 * La clase Libro representa un libro, que es un tipo de Articulo.
 * Un libro tiene un título, autor, editorial y un año de publicación.
 *  @author Fuentes Esquivel Elian Andrea 
 * @author Campos Mendoza Edgar Felipe       
 * @version 1.0                 
 * @date 16 oct
 *  2024. 
 */
public class Libro extends Articulo {
    private String autor;
    private String editorial;

    /**
     * Crea un nuevo libro con el título, autor, editorial y año especificados.
     * 
     * @param titulo    el título del libro
     * @param autor     el autor del libro
     * @param editorial la editorial que publicó el libro
     * @param anio      el año de publicación del libro
     */
    public Libro(String titulo, String autor, String editorial, int anio) {
        super(titulo, anio);
        this.autor = autor;
        this.editorial = editorial;
    }

    /**
     * Obtiene el autor del libro.
     * 
     * @return el autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el autor del libro.
     * 
     * @param autor el nuevo autor del libro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene la editorial del libro.
     * 
     * @return la editorial que publicó el libro
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * Establece la editorial del libro.
     * 
     * @param editorial la nueva editorial del libro
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * Devuelve una representación en cadena del libro, incluyendo el título, año,
     * autor y editorial.
     * 
     * @return una cadena que contiene los detalles del libro
     */
    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor + ", Editorial: " + editorial;
    }
}

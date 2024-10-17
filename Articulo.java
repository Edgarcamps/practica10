/**
 * La clase Articulo representa un artículo con un título y un año de publicación.
 *  @author Fuentes Esquivel Elian Andrea 
 * @author Campos Mendoza Edgar Felipe       
 * @version 1.0                 
 * @date 16 oct
 *  2024. 
 */
public class Articulo {
    protected String titulo;
    protected int anio;

    /**
     * Crea un nuevo artículo con el título y el año especificados.
     * 
     * @param titulo el título del artículo
     * @param anio el año de publicación del artículo
     */
    public Articulo(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
    }

    /**
     * Obtiene el título del artículo.
     * 
     * @return el título del artículo
     */
    public String getTitulo() {
        return titulo; 
    }

    /**
     * Establece el título del artículo.
     * 
     * @param titulo el nuevo título del artículo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el año de publicación del artículo.
     * 
     * @return el año de publicación del artículo
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Establece el año de publicación del artículo.
     * 
     * @param anio el nuevo año de publicación del artículo
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * Devuelve una representación en cadena del artículo.
     * 
     * @return una cadena que contiene el título y el año de publicación del artículo
     */
    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Año: " + anio;
    }
}

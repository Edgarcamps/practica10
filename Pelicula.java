/**
 * La clase Pelicula representa una película que hereda de la clase Articulo.
 * Una película tiene un título, director, género, duración en minutos, idioma, 
 * y un año de publicación.
 *  @author Fuentes Esquivel Elian Andrea 
 * @author Campos Mendoza Edgar Felipe       
 * @version 1.0                 
 * @date 16 oct
 *  2024. 
 */
public class Pelicula extends Articulo {
    private String director;
    private String genero;
    private int duracion; // Duración en minutos
    private String idioma;

    /**
     * Crea una nueva película con los detalles especificados.
     * 
     * @param titulo   el título de la película
     * @param director el director de la película
     * @param genero   el género de la película
     * @param duracion la duración de la película en minutos
     * @param idioma   el idioma en el que está la película
     * @param anio     el año de estreno de la película
     */
    public Pelicula(String titulo, String director, String genero, int duracion, String idioma, int anio) {
        super(titulo, anio);
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.idioma = idioma;
    }

    /**
     * Obtiene el director de la película.
     * 
     * @return el director de la película
     */
    public String getDirector() {
        return director;
    }

    /**
     * Establece el director de la película.
     * 
     * @param director el nuevo director de la película
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * Obtiene el género de la película.
     * 
     * @return el género de la película
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el género de la película.
     * 
     * @param genero el nuevo género de la película
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obtiene la duración de la película en minutos.
     * 
     * @return la duración de la película en minutos
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Establece la duración de la película en minutos.
     * 
     * @param duracion la nueva duración de la película en minutos
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Obtiene el idioma en el que está la película.
     * 
     * @return el idioma de la película
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * Establece el idioma de la película.
     * 
     * @param idioma el nuevo idioma de la película
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     * Devuelve una representación en cadena de la película, incluyendo 
     * el título, año, director, género, duración e idioma.
     * 
     * @return una cadena que contiene los detalles de la película
     */
    @Override 
    public String toString() {
        return super.toString() + ", Director: " + director + ", Género: " + genero +
               ", Duración: " + duracion + " min, Idioma: " + idioma; 
    }
}

/**
 * La clase Disco representa un disco musical que hereda de la clase Articulo.
 * Un Disco tiene un título, año de publicación, género musical, intérprete,
 * número de canciones e idioma.
 *  @author Fuentes Esquivel Elian Andrea 
 * @author Campos Mendoza Edgar Felipe       
 * @version 1.0                 
 * @date 16 oct
 *  2024. 
 */
public class Disco extends Articulo {
    private String genero;
    private String interprete;
    private int numCanciones;
    private String idioma;

    /**
     * Crea un nuevo disco con los detalles especificados.
     * 
     * @param titulo       el título del disco
     * @param genero       el género musical del disco
     * @param interprete   el intérprete principal del disco
     * @param numCanciones el número de canciones que tiene el disco
     * @param idioma       el idioma en el que están las canciones del disco
     * @param anio         el año de publicación del disco
     */
    public Disco(String titulo, String genero, String interprete, int numCanciones, String idioma, int anio) {
        super(titulo, anio);
        this.genero = genero;
        this.interprete = interprete;
        this.numCanciones = numCanciones;
        this.idioma = idioma;
    }

    /**
     * Obtiene el género musical del disco.
     * 
     * @return el género del disco
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el género musical del disco.
     * 
     * @param genero el nuevo género del disco
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obtiene el intérprete del disco.
     * 
     * @return el intérprete del disco
     */
    public String getInterprete() {
        return interprete;
    }

    /**
     * Establece el intérprete del disco.
     * 
     * @param interprete el nuevo intérprete del disco
     */
    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    /**
     * Obtiene el número de canciones del disco.
     * 
     * @return el número de canciones del disco
     */
    public int getNumCanciones() {
        return numCanciones;
    }

    /**
     * Establece el número de canciones del disco.
     * 
     * @param numCanciones el nuevo número de canciones del disco
     */
    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    /**
     * Obtiene el idioma de las canciones del disco.
     * 
     * @return el idioma de las canciones del disco
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * Establece el idioma de las canciones del disco.
     * 
     * @param idioma el nuevo idioma de las canciones del disco
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     * Devuelve una representación en cadena del disco, incluyendo
     * el título, año, género, intérprete, número de canciones e idioma.
     * 
     * @return una cadena que contiene los detalles del disco
     */
    @Override
    public String toString() {
        return super.toString() + ". Género: " + genero + ", Intérprete: " + interprete + 
               ", Núm de Canciones: " + numCanciones + ", Idioma: " + idioma;
    }
}

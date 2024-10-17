import java.util.ArrayList;
import java.util.Scanner;

/**
 * La clase PruebaArticulos gestiona una lista de libros, discos y películas, permitiendo 
 * al usuario agregar nuevos elementos y mostrarlos a través de un menú interactivo.
 * Archivo a modificar.
 * Modifica el código ASCII que representa a un camello y agrega una cola.
 * @author Fuentes Esquivel Elian Andrea 
 * @author Campos Mendoza Edgar Felipe       
 * @version 1.0                 
 * @date 16 oct
 *  2024. 
 */
public class PruebaArticulos {
    // Listas para almacenar libros, discos y películas
    private static ArrayList<Libro> libros = new ArrayList<>();
    private static ArrayList<Disco> discos = new ArrayList<>();
    private static ArrayList<Pelicula> peliculas = new ArrayList<>();
    // Scanner para la entrada del usuario
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Método principal que presenta un menú interactivo para agregar y mostrar libros,
     * discos y películas. El ciclo continúa hasta que el usuario elige salir.
     *
     * @param args los argumentos de línea de comandos (no se utilizan en este caso)
     */
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Agregar libro");
            System.out.println("2. Agregar disco");
            System.out.println("3. Agregar película");
            System.out.println("4. Mostrar libros");
            System.out.println("5. Mostrar discos");
            System.out.println("6. Mostrar películas");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            // Lógica del menú
            switch (opcion) {
                case 1:
                    agregarLibro();
                    break;
                case 2:
                    agregarDisco();
                    break;
                case 3:
                    agregarPelicula();
                    break;
                case 4:
                    mostrarLibros();
                    break;
                case 5:
                    mostrarDiscos();
                    break;
                case 6:
                    mostrarPeliculas();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7); // El ciclo termina cuando se selecciona "Salir"
    }

    /**
     * Solicita al usuario los detalles de un libro y lo agrega a la lista de libros.
     */
    private static void agregarLibro() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Editorial: ");
        String editorial = scanner.nextLine();
        System.out.print("Año de publicación: ");
        int anio = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        libros.add(new Libro(titulo, autor, editorial, anio));
    }

    /**
     * Solicita al usuario los detalles de un disco y lo agrega a la lista de discos.
     */
    private static void agregarDisco() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Género: ");
        String genero = scanner.nextLine();
        System.out.print("Intérprete: ");
        String interprete = scanner.nextLine();
        System.out.print("Número de canciones: ");
        int numCanciones = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Idioma: ");
        String idioma = scanner.nextLine();
        System.out.print("Año de lanzamiento: ");
        int anio = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        discos.add(new Disco(titulo, genero, interprete, numCanciones, idioma, anio));
    }

    /**
     * Solicita al usuario los detalles de una película y la agrega a la lista de películas.
     */
    private static void agregarPelicula() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Director: ");
        String director = scanner.nextLine();
        System.out.print("Género: ");
        String genero = scanner.nextLine();
        System.out.print("Duración (minutos): ");
        int duracion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Idioma: ");
        String idioma = scanner.nextLine();
        System.out.print("Año de filmación: ");
        int anio = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        peliculas.add(new Pelicula(titulo, director, genero, duracion, idioma, anio));
    }

    /**
     * Muestra la lista de libros registrados en el sistema.
     */
    private static void mostrarLibros() {
        System.out.println("\nLista de libros:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    /**
     * Muestra la lista de discos registrados en el sistema.
     */
    private static void mostrarDiscos() {
        System.out.println("\nLista de discos:");
        for (Disco disco : discos) {
            System.out.println(disco);
        }
    }

    /**
     * Muestra la lista de películas registradas en el sistema.
     */
    private static void mostrarPeliculas() {
        System.out.println("\nLista de películas:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
}

import java.util.Scanner; // Importar la clase Scanner

public class Libro { // Declaración de la clase Libro

    // Atributos de la clase Libro
    private String ISBN;        // Almacena el código ISBN del libro
    private String titulo;      // Almacena el título del libro
    private String autor;       // Almacena el nombre del autor del libro
    private int numeroPaginas;  // Almacena el número de páginas del libro

    // Constructor con todos los atributos pasados por parámetro
    public Libro(String ISBN, String titulo, String autor, int numeroPaginas) { // Declaración del constructor
        this.ISBN = ISBN;              // Asignar el valor del parámetro ISBN al atributo ISBN
        this.titulo = titulo;         // Asignar el valor del parámetro titulo al atributo titulo
        this.autor = autor;           // Asignar el valor del parámetro autor al atributo autor
        this.numeroPaginas = numeroPaginas; // Asignar el valor del parámetro numeroPaginas al atributo numeroPaginas
    } // Fin del constructor

    public Libro() { // Declaración del constructor vacío
        // Este constructor no inicializa los atributos, se usa para crear un objeto sin datos iniciales
    } // Fin del constructor vacío

    public void cargarLibro() { // Método para cargar un libro pidiendo los datos al usuario
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir y leer el ISBN del libro
        System.out.print("Ingrese el ISBN del libro: ");
        this.ISBN = scanner.nextLine(); // Guardar el valor ingresado en el atributo ISBN

        // Pedir y leer el título del libro
        System.out.print("Ingrese el título del libro: ");
        this.titulo = scanner.nextLine(); // Guardar el valor ingresado en el atributo titulo

        // Pedir y leer el autor del libro
        System.out.print("Ingrese el autor del libro: ");
        this.autor = scanner.nextLine(); // Guardar el valor ingresado en el atributo autor

        // Pedir y leer el número de páginas del libro
        System.out.print("Ingrese el número de páginas del libro: ");
        this.numeroPaginas = scanner.nextInt(); // Guardar el valor ingresado en el atributo numeroPaginas
        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para mostrar la información del libro
    public void mostrarInformacion() {
        // Mostrar un encabezado
        System.out.println("\nInformación del libro:");

        // Mostrar el ISBN del libro
        System.out.println("ISBN: " + this.ISBN);

        // Mostrar el título del libro
        System.out.println("Título: " + this.titulo);

        // Mostrar el autor del libro
        System.out.println("Autor: " + this.autor);

        // Mostrar el número de páginas del libro
        System.out.println("Número de páginas: " + this.numeroPaginas);
    } // Fin del método mostrarInformacion
} // Fin de la clase Libro

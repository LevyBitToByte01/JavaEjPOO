/*
Crear un package llamado Models dentro de src.
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. 
**Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
import Models.Libro;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear un objeto Libro usando el constructor vacío
        Libro libro = new Libro(); // Crear un objeto Libro

        // Llamar al método cargarLibro para que el usuario ingrese los datos del libro
        libro.cargarLibro();

        // Llamar al método mostrarInformacion para mostrar los datos del libro
        libro.mostrarInformacion();
    }
}

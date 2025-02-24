public class MainLibro { // Clase principal para mostrar los datos del libro
       public static void main(String[] args) { // Método principal
        // Crear un objeto Libro usando el constructor vacío
        Libro libro = new Libro(); // Crear un objeto Libro

        // Llamar al método cargarLibro para que el usuario ingrese los datos del libro
        libro.cargarLibro();

        // Llamar al método mostrarInformacion para mostrar los datos del libro
        libro.mostrarInformacion();
    }
    
}

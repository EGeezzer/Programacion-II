package sistemuniv;
import java .util.*;
public class TestBiblioteca {
    public static void main(String[] args) {
        // Creación de biblioteca con horario (composición)
        Biblioteca biblio = new Biblioteca("Biblioteca UMSA", "Lunes a Viernes", "08:00", "18:00");

        // Crear autores (agregación)
        Autor a1 = new Autor("Gabriel García Márquez", "Colombiano");
        Autor a2 = new Autor("Mario Vargas Llosa", "Peruano");

        biblio.agregarAutor(a1);
        biblio.agregarAutor(a2);

        // Crear libro con páginas (composición)
        List<Libro.Pagina> paginas = new ArrayList<>();
        paginas.add(new Libro.Pagina(1, "Era un día soleado..."));
        paginas.add(new Libro.Pagina(2, "El protagonista emprendió su viaje."));
        Libro libro = new Libro("Cien Años de Soledad", "123-ABC", paginas);

        biblio.agregarLibro(libro);

        // Crear estudiante y préstamo (asociación)
        Estudiante est = new Estudiante(1001, "Elvin Chiara");
        biblio.prestarLibro(est, libro);

        // Mostrar estado general
        biblio.mostrarEstado();

        // Leer libro
        libro.leer();

        // Cerrar biblioteca
        biblio.cerrarBiblioteca();
    }
}
    


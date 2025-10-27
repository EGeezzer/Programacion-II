package sistemuniv;
import java.util.*;
public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    private List<Autor> autores;
    private List<Prestamo> prestamos;
    private Horario horario;
    public Biblioteca(String nombre, String dias, String horaApertura, String horaCierre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.horario = new Horario(dias, horaApertura, horaCierre);
    }
    // Agregación
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }
    // Asociación
    public void prestarLibro(Estudiante estudiante, Libro libro) {
        Prestamo prestamo = new Prestamo(estudiante, libro);
        prestamos.add(prestamo);
        System.out.println("Libro prestado: " + libro.getTitulo() + " a " + estudiante.getNombre());
    }
    public void mostrarEstado() {
        System.out.println("\n=== ESTADO DE LA BIBLIOTECA: " + nombre + " ===");
        horario.mostrarHorario();
        System.out.println("\nLibros disponibles:");
        for (Libro l : libros) System.out.println("- " + l.getTitulo());
        System.out.println("\nAutores registrados:");
        for (Autor a : autores) a.mostrarInfo();
        System.out.println("\nPréstamos activos:");
        for (Prestamo p : prestamos) p.mostrarInfo();
    }
    public void cerrarBiblioteca() {
        System.out.println("\nLa biblioteca '" + nombre + "' ha cerrado.");
        prestamos.clear();
        System.out.println("Todos los préstamos han sido finalizados.");
    }
    //  composición
    class Horario {
        private String dias;
        private String horaApertura;
        private String horaCierre;
        public Horario(String dias, String horaApertura, String horaCierre) {
            this.dias = dias;
            this.horaApertura = horaApertura;
            this.horaCierre = horaCierre;
        }
        public void mostrarHorario() {
            System.out.println("Horario: " + dias + ", de " + horaApertura + " a " + horaCierre);
        }
    }
}
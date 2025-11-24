package sistemuniv;
import java.util.*;
import java.io.Serializable;

public class Biblioteca implements Serializable {
    public ArrayList<Libro> libros = new ArrayList<>();
    public ArrayList<Autor> autores = new ArrayList<>();
    public ArrayList<Prestamo> prestamos = new ArrayList<>();
    public ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public void agregarAutor(Autor a) { autores.add(a); }
    public void agregarLibro(Libro l) { libros.add(l); }
    public void agregarEstudiante(Estudiante e) { estudiantes.add(e); }
    
    public void prestar(Libro l, Estudiante e) { 
        prestamos.add(new Prestamo(l, e)); 
    }

    public Iterable<Autor> getAutores() {
        return autores;
    }

    public Iterable<Libro> getLibros() {
        return libros;
    }

    public Iterable<Prestamo> getPrestamos() {
        return prestamos;
    }

    public Iterable<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void prestarLibro(Estudiante est, Libro libro) {
        prestamos.add(new Prestamo(libro, est));
    }

    public Libro getLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public void mostrarEstado() {
        System.out.println("=== ESTADO BIBLIOTECA ===");
        System.out.println("Autores: " + autores.size());
        System.out.println("Libros: " + libros.size());
        System.out.println("Préstamos activos: " + prestamos.size());
        System.out.println("Estudiantes: " + estudiantes.size());
    }
}
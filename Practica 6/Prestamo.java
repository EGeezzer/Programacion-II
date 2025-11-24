package sistemuniv;
import java.io.Serializable;
import java.time.LocalDate;

public class Prestamo implements Serializable {
    private Libro libro;
    private Estudiante estudiante;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(Libro libro, Estudiante estudiante) {
        this.libro = libro;
        this.estudiante = estudiante;
        this.fechaPrestamo = LocalDate.now();
        this.fechaDevolucion = null; // Aún no devuelto
    }

    public Libro getLibro() { return libro; }
    public Estudiante getEstudiante() { return estudiante; }
    public LocalDate getFechaPrestamo() { return fechaPrestamo; }
    public LocalDate getFechaDevolucion() { return fechaDevolucion; }
    
    public void devolver() {
        this.fechaDevolucion = LocalDate.now();
    }

    @Override
    public String toString() {
        return estudiante + " → " + libro + " (" + fechaPrestamo + ")";
    }
}
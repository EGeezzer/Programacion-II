package sistemuniv;
class Prestamo {
    private String fechaPrestamo;
    private String fechaDevolucion;
    private Estudiante estudiante;
    private Libro libro;

    public Prestamo(Estudiante estudiante, Libro libro) {
        this.estudiante = estudiante;
        this.libro = libro;
        this.fechaPrestamo = "2025-10-27";
        this.fechaDevolucion = "2025-11-10";
    }

    public void mostrarInfo() {
        System.out.println("Préstamo -> Libro: " + libro.getTitulo() +
                " | Estudiante: " + estudiante.getNombre() +
                " | Fecha: " + fechaPrestamo + " a " + fechaDevolucion);
    }
}
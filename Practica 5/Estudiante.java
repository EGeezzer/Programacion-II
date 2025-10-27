package sistemuniv;

class Estudiante {
    private int codigo;
    private String nombre;

    public Estudiante(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " (Código: " + codigo + ")");
    }
}
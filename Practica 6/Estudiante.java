package sistemuniv;
import java.io.Serializable;

public class Estudiante implements Serializable {
    private int codigo;
    private String nombre;

    public Estudiante(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() { return codigo; }
    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return codigo + " - " + nombre;
    }
}
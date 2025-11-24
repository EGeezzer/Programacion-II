package sistemuniv;
import java.io.Serializable;
import java.util.ArrayList;

public class Libro implements Serializable {
    private String titulo;
    private String isbn;
    private Autor autor;
    private ArrayList<String> paginas;

    public Libro(String titulo, String isbn, Autor autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.paginas = new ArrayList<>();
    }

    public String getTitulo() { return titulo; }
    public String getISBN() { return isbn; }
    public Autor getAutor() { return autor; }
    public ArrayList<String> getPaginas() { return paginas; }

    @Override
    public String toString() {
        return titulo + " - " + autor.getNombre();
    }
}
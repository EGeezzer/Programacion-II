package sistemuniv;
import java .util.*;
class Libro {
    private String titulo;
    private String ISBN;
    private List<Pagina> paginas;
    public Libro(String titulo, String ISBN, List<Pagina> paginas) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.paginas = paginas;
    }
    public String getTitulo() {
        return titulo;
    }
    public void leer() {
        System.out.println("\nLeyendo libro: " + titulo);
        for (Pagina p : paginas) {
            p.mostrarPagina();
        }
    }
    // composición
    static class Pagina {
        private int numero;
        private String contenido;

        public Pagina(int numero, String contenido) {
            this.numero = numero;
            this.contenido = contenido;
        }
        public void mostrarPagina() {
            System.out.println("Página " + numero + ": " + contenido);
        }
    }
}




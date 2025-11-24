package sistemuniv;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class DialogMostrarDatos extends JDialog {

    private Biblioteca biblioteca;

    private JTable tablaAutores;
    private JTable tablaLibros;
    private JTable tablaPrestamos;
    private JTable tablaEstudiantes;

    public DialogMostrarDatos(Frame parent, Biblioteca biblioteca) {
        super(parent, true);
        this.biblioteca = biblioteca;

        setTitle("Estado de la Biblioteca");
        setSize(800, 600);
        setLocationRelativeTo(parent);

        initComponents();
        cargarDatos();
    }

    private void initComponents() {
        JTabbedPane tabs = new JTabbedPane();

        // TAB AUTORES
        tablaAutores = new JTable(new DefaultTableModel(new Object[]{"Nombre", "Nacionalidad"}, 0));
        tabs.add("Autores", new JScrollPane(tablaAutores));

        // TAB LIBROS
        tablaLibros = new JTable(new DefaultTableModel(new Object[]{"Título", "ISBN", "Autor"}, 0));
        tabs.add("Libros", new JScrollPane(tablaLibros));

        // TAB ESTUDIANTES
        tablaEstudiantes = new JTable(new DefaultTableModel(new Object[]{"Código", "Nombre"}, 0));
        tabs.add("Estudiantes", new JScrollPane(tablaEstudiantes));

        // TAB PRÉSTAMOS
        tablaPrestamos = new JTable(new DefaultTableModel(new Object[]{"Libro", "Estudiante", "Fecha Préstamo"}, 0));
        tabs.add("Préstamos", new JScrollPane(tablaPrestamos));

        add(tabs, BorderLayout.CENTER);
    }

    private void cargarDatos() {
        cargarAutores();
        cargarLibros();
        cargarEstudiantes();
        cargarPrestamos();
    }

    private void cargarAutores() {
        DefaultTableModel model = (DefaultTableModel) tablaAutores.getModel();
        model.setRowCount(0);
        for (Autor a : biblioteca.getAutores()) {
            model.addRow(new Object[]{a.getNombre(), a.getNacionalidad()});
        }
    }

    private void cargarLibros() {
        DefaultTableModel model = (DefaultTableModel) tablaLibros.getModel();
        model.setRowCount(0);
        for (Libro l : biblioteca.getLibros()) {
            model.addRow(new Object[]{l.getTitulo(), l.getISBN(), l.getAutor().getNombre()});
        }
    }

    private void cargarEstudiantes() {
        DefaultTableModel model = (DefaultTableModel) tablaEstudiantes.getModel();
        model.setRowCount(0);
        for (Estudiante e : biblioteca.getEstudiantes()) {
            model.addRow(new Object[]{e.getCodigo(), e.getNombre()});
        }
    }

    private void cargarPrestamos() {
        DefaultTableModel model = (DefaultTableModel) tablaPrestamos.getModel();
        model.setRowCount(0);
        for (Prestamo p : biblioteca.getPrestamos()) {
            model.addRow(new Object[]{
                p.getLibro().getTitulo(),
                p.getEstudiante().getNombre(),
                p.getFechaPrestamo()
            });
        }
    }
}
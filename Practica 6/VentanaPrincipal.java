package sistemuniv;

import javax.swing.*;

public class VentanaPrincipal extends JFrame {

    Biblioteca biblioteca;

    public VentanaPrincipal() {
        biblioteca = Persistencia.cargar();

        setTitle("Sistema de Biblioteca - UMSA");
        setSize(550, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear botones
        JButton btnAutor = new JButton("Agregar Autor");
        JButton btnLibro = new JButton("Agregar Libro");
        JButton btnEstudiante = new JButton("Agregar Estudiante");
        JButton btnPrestamo = new JButton("Prestar Libro");
        JButton btnMostrar = new JButton("Mostrar Datos");
        JButton btnGuardar = new JButton("Guardar Datos");

        // Establecer tamaños preferidos para los botones
        btnAutor.setPreferredSize(new java.awt.Dimension(150, 35));
        btnLibro.setPreferredSize(new java.awt.Dimension(150, 35));
        btnEstudiante.setPreferredSize(new java.awt.Dimension(150, 35));
        btnPrestamo.setPreferredSize(new java.awt.Dimension(150, 35));
        btnMostrar.setPreferredSize(new java.awt.Dimension(150, 35));
        btnGuardar.setPreferredSize(new java.awt.Dimension(150, 35));

        // Agregar action listeners
        btnAutor.addActionListener(e -> new DialogAgregarAutor(this, biblioteca).setVisible(true));
        btnLibro.addActionListener(e -> new DialogAgregarLibro(this, biblioteca).setVisible(true));
        btnEstudiante.addActionListener(e -> new DialogAgregarEstudiante(this, biblioteca).setVisible(true));
        btnPrestamo.addActionListener(e -> new DialogPrestarLibro(this, biblioteca).setVisible(true));
        btnMostrar.addActionListener(e -> mostrarDatos());
        btnGuardar.addActionListener(e -> {
            Persistencia.guardar(biblioteca);
            JOptionPane.showMessageDialog(this, "Datos guardados correctamente");
        });

        // Crear panel principal con diseño organizado
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Título
        JLabel titulo = new JLabel("Sistema de Gestión de Biblioteca");
        titulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 18));
        titulo.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(titulo);
        panel.add(Box.createRigidArea(new java.awt.Dimension(0, 20)));

        // Panel para los botones en dos columnas
        JPanel botonesPanel = new JPanel();
        botonesPanel.setLayout(new java.awt.GridLayout(3, 2, 10, 10));

        // Agregar botones al panel de botones
        botonesPanel.add(btnAutor);
        botonesPanel.add(btnLibro);
        botonesPanel.add(btnEstudiante);
        botonesPanel.add(btnPrestamo);
        botonesPanel.add(btnMostrar);
        botonesPanel.add(btnGuardar);

        panel.add(botonesPanel);

        // Panel inferior con información del estado
        JPanel infoPanel = new JPanel();
        infoPanel.setBorder(BorderFactory.createTitledBorder("Información del Sistema"));
        
        JButton btnInfo = new JButton("Ver Estado Actual");
        btnInfo.addActionListener(e -> mostrarInformacionEstado());
        infoPanel.add(btnInfo);

        panel.add(Box.createRigidArea(new java.awt.Dimension(0, 15)));
        panel.add(infoPanel);

        add(panel);
    }

    private void mostrarDatos() {
        // Verificar si hay datos para mostrar
        if (biblioteca.getAutores().iterator().hasNext() || 
            biblioteca.getLibros().iterator().hasNext() || 
            biblioteca.getEstudiantes().iterator().hasNext() || 
            biblioteca.getPrestamos().iterator().hasNext()) {
            
            new DialogMostrarDatos(this, biblioteca).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, 
                "No hay datos registrados en el sistema.\nPor favor, agregue autores, libros, estudiantes o préstamos primero.",
                "Sin datos",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void mostrarInformacionEstado() {
        int totalAutores = 0;
        int totalLibros = 0;
        int totalEstudiantes = 0;
        int totalPrestamos = 0;

        // Contar autores
        for (Autor autor : biblioteca.getAutores()) {
            totalAutores++;
        }

        // Contar libros
        for (Libro libro : biblioteca.getLibros()) {
            totalLibros++;
        }

        // Contar estudiantes
        for (Estudiante estudiante : biblioteca.getEstudiantes()) {
            totalEstudiantes++;
        }

        // Contar préstamos
        for (Prestamo prestamo : biblioteca.getPrestamos()) {
            totalPrestamos++;
        }

        String mensaje = String.format(
            "ESTADO ACTUAL DEL SISTEMA:\n\n" +
            "📚 Autores registrados: %d\n" +
            "📖 Libros registrados: %d\n" +
            "👨‍🎓 Estudiantes registrados: %d\n" +
            "🔄 Préstamos activos: %d\n\n" +
            "Presione 'Mostrar Datos' para ver detalles completos.",
            totalAutores, totalLibros, totalEstudiantes, totalPrestamos
        );

        JOptionPane.showMessageDialog(this, 
            mensaje,
            "Estado del Sistema",
            JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        // CORRECCIÓN: Usar getSystemLookAndFeelClassName() en lugar de getSystemLookAndFeel()
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            try {
                // Fallback a Nimbus si el look and feel del sistema falla
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        SwingUtilities.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }
}
package sistemuniv;
import javax.swing.*;

public class DialogPrestarLibro extends JDialog {

    public DialogPrestarLibro(JFrame parent, Biblioteca b) {
        super(parent, "Prestar Libro", true);

        JComboBox<Libro> cmbLibros = new JComboBox<>();
        for (Libro libro : b.getLibros()) {
            cmbLibros.addItem(libro);
        }

        JComboBox<Estudiante> cmbEstudiantes = new JComboBox<>();
        for (Estudiante est : b.getEstudiantes()) {
            cmbEstudiantes.addItem(est);
        }

        JButton prestar = new JButton("Prestar");
        JButton cancelar = new JButton("Cancelar");

        prestar.addActionListener(e -> {
            if (cmbLibros.getSelectedItem() == null || cmbEstudiantes.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(this, "Seleccione libro y estudiante");
                return;
            }
            
            b.prestar((Libro)cmbLibros.getSelectedItem(), (Estudiante)cmbEstudiantes.getSelectedItem());
            JOptionPane.showMessageDialog(parent, "Préstamo registrado correctamente");
            dispose();
        });

        cancelar.addActionListener(e -> dispose());

        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Libro:"));
        panel1.add(cmbLibros);
        
        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Estudiante:"));
        panel2.add(cmbEstudiantes);
        
        JPanel panel3 = new JPanel();
        panel3.add(prestar);
        panel3.add(cancelar);
        
        p.add(panel1);
        p.add(panel2);
        p.add(panel3);

        add(p);
        pack();
        setLocationRelativeTo(parent);
    }
}
package sistemuniv;
import javax.swing.*;

public class DialogAgregarLibro extends JDialog {

    public DialogAgregarLibro(JFrame parent, Biblioteca b) {
        super(parent, "Nuevo Libro", true);

        JTextField txtTitulo = new JTextField(15);
        JTextField txtISBN = new JTextField(15);

        JComboBox<Autor> cmbAutor = new JComboBox<>();
        for (Autor autor : b.getAutores()) {
            cmbAutor.addItem(autor);
        }

        JButton agregar = new JButton("Guardar");
        JButton cancelar = new JButton("Cancelar");

        agregar.addActionListener(e -> {
            if (txtTitulo.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "El título es obligatorio");
                return;
            }
            if (cmbAutor.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(this, "Seleccione un autor");
                return;
            }
            
            b.agregarLibro(new Libro(txtTitulo.getText(), txtISBN.getText(), 
                                   (Autor) cmbAutor.getSelectedItem()));
            JOptionPane.showMessageDialog(parent, "Libro agregado correctamente");
            dispose();
        });

        cancelar.addActionListener(e -> dispose());

        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Título:"));
        panel1.add(txtTitulo);
        
        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("ISBN:"));
        panel2.add(txtISBN);
        
        JPanel panel3 = new JPanel();
        panel3.add(new JLabel("Autor:"));
        panel3.add(cmbAutor);
        
        JPanel panel4 = new JPanel();
        panel4.add(agregar);
        panel4.add(cancelar);
        
        p.add(panel1);
        p.add(panel2);
        p.add(panel3);
        p.add(panel4);

        add(p);
        pack();
        setLocationRelativeTo(parent);
    }
}
package sistemuniv;
import javax.swing.*;

public class DialogAgregarAutor extends JDialog {

    public DialogAgregarAutor(JFrame parent, Biblioteca b) {
        super(parent, "Nuevo Autor", true);

        JTextField txtNombre = new JTextField(15);
        JTextField txtNacionalidad = new JTextField(15);

        JButton agregar = new JButton("Guardar");
        JButton cancelar = new JButton("Cancelar");

        agregar.addActionListener(e -> {
            if (txtNombre.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "El nombre es obligatorio");
                return;
            }
            b.agregarAutor(new Autor(txtNombre.getText(), txtNacionalidad.getText()));
            JOptionPane.showMessageDialog(parent, "Autor agregado correctamente");
            dispose();
        });

        cancelar.addActionListener(e -> dispose());

        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Nombre:"));
        panel1.add(txtNombre);
        
        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Nacionalidad:"));
        panel2.add(txtNacionalidad);
        
        JPanel panel3 = new JPanel();
        panel3.add(agregar);
        panel3.add(cancelar);
        
        p.add(panel1);
        p.add(panel2);
        p.add(panel3);

        add(p);
        pack();
        setLocationRelativeTo(parent);
    }
}
package sistemuniv;

import javax.swing.*;

public class DialogAgregarEstudiante extends JDialog {

    public DialogAgregarEstudiante(JFrame parent, Biblioteca b) {
        super(parent, "Nuevo Estudiante", true);

        JTextField txtCodigo = new JTextField(10);
        JTextField txtNombre = new JTextField(15);

        JButton agregar = new JButton("Guardar");
        JButton cancelar = new JButton("Cancelar");

        agregar.addActionListener(e -> {
            try {
                if (txtCodigo.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "El código es obligatorio");
                    return;
                }
                if (txtNombre.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "El nombre es obligatorio");
                    return;
                }
                
                int codigo = Integer.parseInt(txtCodigo.getText());
                Estudiante est = new Estudiante(codigo, txtNombre.getText());
                b.agregarEstudiante(est);
                
                JOptionPane.showMessageDialog(parent, "Estudiante agregado correctamente: " + est);
                dispose();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "El código debe ser un número válido");
            }
        });

        cancelar.addActionListener(e -> dispose());

        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        p.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Código:"));
        panel1.add(txtCodigo);
        
        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Nombre:"));
        panel2.add(txtNombre);
        
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
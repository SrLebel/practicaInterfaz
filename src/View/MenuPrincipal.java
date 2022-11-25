package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuPrincipal extends JFrame implements ActionListener{
    Color base = new Color(36, 39, 58);
    Color text = new Color(202, 211, 245);
    Color surface1 = new Color(73, 77, 100);

    private JLabel l;
    private JButton b;
    private JComboBox<String>Cb;

    public MenuPrincipal() {
        setLayout(null);
        setBounds(50, 50, 600, 400);
        setTitle("Menu Principal");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(false);
        getContentPane().setBackground(base);
        
        l = new View.Components.titulo("Menu Principal");
        l.setBounds(226,87,149,46);
        add(l);
        
        Cb = new JComboBox<String>();
        Cb.addItem("Escoja una opción");
        Cb.addItem("Programas Academicos");
        Cb.addItem("Academias");
        Cb.addItem("Listado de Academias");
        Cb.addItem("Listado de Programas");
        Cb.setFont(new Font("JetBrains Mono", Font.BOLD, 14));
        Cb.setBackground(surface1);
        Cb.setForeground(text);
        Cb.setBounds(157,180,287,41);
        add(Cb);
        
        b = new View.Components.boton("Ingresar");
        b.setBounds(226,259,148,40);
        b.addActionListener(this);
        add(b);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        int seleccion = Cb.getSelectedIndex();
        if (e.getSource()==b){
            switch (seleccion) {
                case 1:
                    dispose();
                    new ProgramasAcademicos();
                    break;

                case 2:
                    dispose();
                    new Academias();
                    break;

                case 3:
                    dispose();
                    new ListaAcademias();
                    break;
                case 4:
                    dispose();
                    new ListaProgramas();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Seleccione una opcion valida");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new MenuPrincipal();
    }
}
import javax.swing.*;
import java.awt.*;

public class menuPrincipal {
    static Color base = new Color(36, 39, 58);
    static Color pink = new Color(245, 189, 230);
    static Color text = new Color(202, 211, 245);

    void generarComponentes () {
        JFrame interfazPrincipal = new JFrame();
        JPanel panelPrincipal = new JPanel();
        JComboBox menu = new JComboBox();
        JButton Ingreso = new JButton("Ingresar");
        JLabel texto = new JLabel("Menu Principal \n Open Academic");

        interfazPrincipal.setSize(1440, 1024);
        interfazPrincipal.setVisible(true);
        interfazPrincipal.setLayout(null);
        
        panelPrincipal.setSize(1440, 1024);
        panelPrincipal.setVisible(true);
        panelPrincipal.setBackground(base);

        menu.setVisible(true);
        
        texto.setForeground(text);
        texto.setBounds(50, 100, 100, 30);

        interfazPrincipal.add(panelPrincipal);
        panelPrincipal.add(texto);
        panelPrincipal.add(menu);
    }
}
import javax.swing.*;
import java.awt.*;

public class menuPrincipal {
    static Color base = new Color(36, 39, 58);
    static Color pink = new Color(245, 189, 230);

    void generarComponentes () {
        JFrame interfazPrincipal = new JFrame();
        JPanel panelPrincipal = new JPanel();
        JLabel texto = new JLabel("Menu Principal \n Open Academic");

        interfazPrincipal.setSize(600, 400);
        interfazPrincipal.setVisible(true);
        interfazPrincipal.setLayout(null);
        
        panelPrincipal.setSize(600, 400);
        panelPrincipal.setVisible(true);
        panelPrincipal.setBackground(base);
        
        texto.setForeground(pink);
        
        interfazPrincipal.add(panelPrincipal);
        panelPrincipal.add(texto);

    }
}
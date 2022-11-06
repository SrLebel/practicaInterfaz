import javax.swing.*;
import java.awt.*;

public class menuPrincipal {
    static Color base = new Color(36, 39, 58);
    static Color pink = new Color(245, 189, 230);

    void generarComponentes () {
        JFrame interfazPrincipal = new JFrame();
            interfazPrincipal.setSize(600, 400);
            interfazPrincipal.setVisible(true);
            interfazPrincipal.setLayout(null);
        JPanel panelPrincipal = new JPanel();
            panelPrincipal.setSize(600, 400);
            panelPrincipal.setVisible(true);
            panelPrincipal.setBackground(base);
        interfazPrincipal.add(panelPrincipal);
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuPrincipal extends JFrame implements ActionListener {
    Color base = new Color(36, 39, 58);
    Color text = new Color(202, 211, 245);

    private JLabel l;
    private JButton b;
    private JComboBox Cb;

    public MenuPrincipal() {
        setLayout(null);
        setBounds(50, 50, 600, 400);
        setTitle("Menu Principal");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(false);
        getContentPane().setBackground(base);
        setVisible(true);

        l = new JLabel("Menu Principal", SwingConstants.CENTER);
        l.setBounds(226,87,149,46);
        l.setForeground(text);
        l.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
        add(l);

        Cb = new JComboBox<>();
        Cb.setBounds(157,180,287,41);
        add(Cb);

        b = new JButton("Ingresar");
        b.setBounds(226,259,148,41);
        b.addActionListener(this);
        l.setForeground(text);
        l.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
        add(b);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==b){
            
        }
    }
    public static void main(String[] args) {
        new MenuPrincipal();
    }
}
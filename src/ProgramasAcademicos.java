import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProgramasAcademicos extends JFrame implements ActionListener{
    Color base = new Color(36, 39, 58);

    private JLabel l, nom, cod, cred, acred;
    private JTextField nombre, codigo, creditos;
    private JRadioButton si, no;
    private JButton Ingresar, Volver;
    
    public ProgramasAcademicos(){
        setLayout(null);
        setBounds(50, 50, 600, 400);
        setTitle("Programas Academicos");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(false);
        getContentPane().setBackground(base);

        

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

    }
}

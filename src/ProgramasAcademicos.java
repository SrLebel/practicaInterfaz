import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProgramasAcademicos extends JFrame{
    Color base = new Color(36, 39, 58);
    Color text = new Color(202, 211, 245);
    Color surface = new Color(73, 77, 100);
    
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
}

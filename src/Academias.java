import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Academias extends JFrame implements ActionListener{
    Color base = new Color(36, 39, 58);
    
    public Academias(){
        setLayout(null);
        setBounds(50, 50, 600, 400);
        setTitle("Registro de Academias");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(false);
        getContentPane().setBackground(base);

        

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

    }
}

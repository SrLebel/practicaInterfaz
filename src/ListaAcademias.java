import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListaAcademias extends JFrame implements ActionListener{
    Color base = new Color(36, 39, 58);

    public ListaAcademias(){
        setLayout(null);
        setBounds(50, 50, 600, 400);
        setTitle("Listado de Academias");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(false);
        getContentPane().setBackground(base);

        

        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){

    }
}

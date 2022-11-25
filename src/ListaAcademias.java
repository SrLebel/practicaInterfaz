import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListaAcademias extends JFrame implements ActionListener{
    Color base = new Color(36, 39, 58);

    JLabel LA;
    JButton Volver, Recuperar;
    JList<String> Lista;

    public ListaAcademias(){
        setLayout(null);
        setBounds(50, 50, 600, 400);
        setTitle("Listado de Academias");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(false);
        getContentPane().setBackground(base);

        LA = new components.titulo("Listado de Academias");
        Volver = new components.boton("Volver");
        Recuperar = new components.boton("Recuperar");
        String nombres[] = cargarElementos();
        Lista = new JList<String>(nombres);

        LA.setBounds(200, 30, 400, 20);
        Recuperar.setBounds(130, 300, 150, 40);
        Volver.setBounds(280, 300, 150, 40);
        Lista.setBounds(130, 70, 300, 220);

        Volver.addActionListener(this);
        Recuperar.addActionListener(this);

        add(LA);
        add(Volver);
        add(Recuperar);
        add(Lista);

        setVisible(true);
    }

    private String[] cargarElementos(){
        String[] NombresAcademias = {"asd", "aqwe"};
        return NombresAcademias;
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==Recuperar){
            
        }

        if (e.getSource()==Volver){
            dispose();
            new MenuPrincipal();
        }
    }
}

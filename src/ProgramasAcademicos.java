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

        l = new components.titulo("Creación de Programa Academico");
        nom = new components.subtexto("Nombre");
        cod = new components.subtexto("Codigo");
        cred = new components.subtexto("Creditos");
        acred = new components.subtexto("Acreditada");

        nombre = new components.campotexto();
        codigo = new components.campotexto();
        creditos = new components.campotexto();

        si = new components.radioboton("No");
        no = new components.radioboton("No");

        Ingresar = new components.boton("Registar");
        Volver = new components.boton("Volver");

        l.setBounds(150,30,400,20);
        nom.setBounds(180, 70, 100, 20);

        nombre.setBounds(170,90,220,30);

        add(l);
        add(nom);
        add(cod);
        add(cred);
        add(acred);
        add(nombre);
        add(codigo);
        add(creditos);
        add(si);
        add(no);
        add(Ingresar);
        add(Volver);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

    }
}

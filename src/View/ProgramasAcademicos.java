package View;
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

        // Labels
        l = new View.Components.titulo("Creación de Programa Academico");
        nom = new View.Components.subtexto("Nombre");
        cod = new View.Components.subtexto("Codigo");
        cred = new View.Components.subtexto("Creditos");
        acred = new View.Components.subtexto("Acreditada");

        l.setBounds(150,30,400,20);
        nom.setBounds(180, 70, 100, 20);
        cod.setBounds(180, 130, 100, 20);
        cred.setBounds(180, 190, 100, 20);
        acred.setBounds(180, 250, 100, 20);

        // JTextFields
        nombre = new View.Components.campotexto();
        codigo = new View.Components.campotexto();
        creditos = new View.Components.campotexto();

        nombre.setBounds(170,90,220,30);
        codigo.setBounds(170, 150, 220, 30);
        creditos.setBounds(170, 210, 220, 30);

        // JRadioButtons
        ButtonGroup grupo = new ButtonGroup();
        si = new View.Components.radioboton("Si");
        no = new View.Components.radioboton("No");
        grupo.add(si);
        grupo.add(no);

        si.setBounds(170, 270, 50, 20);
        no.setBounds(230, 270, 50, 20);
        
        // JButtons
        Ingresar = new View.Components.boton("Registar");
        Volver = new View.Components.boton("Volver");
        
        Ingresar.setBounds(130, 300, 150, 40);
        Volver.setBounds(280, 300, 150, 40);

        Ingresar.addActionListener(this);
        Volver.addActionListener(this);

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
        if(e.getSource()==Ingresar){
            
        }

        if (e.getSource()==Volver){
            dispose();
            new MenuPrincipal();
        }
    }
}
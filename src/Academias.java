import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Academias extends JFrame implements ActionListener{
    Color base = new Color(36, 39, 58);
    
    private JLabel CA, acred, rs, dir, hor, nit, anio;
    private JTextField RazonSocial, Direccion, Horario, NIT, AnioFundacion;
    private JRadioButton si, no;
    private JButton Ingresar, Volver;

    public Academias(){
        setLayout(null);
        setBounds(50, 50, 600, 400);
        setTitle("Registro de Academias");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(false);
        getContentPane().setBackground(base);

        //labels
        CA = new components.titulo("Creación Academia");
        rs = new components.subtexto("Razon Social"); 
        dir = new components.subtexto("Direccion"); 
        acred = new components.subtexto("Acreditada"); 
        hor = new components.subtexto("Horario de Atención"); 
        nit = new components.subtexto("NIT"); 
        anio = new components.subtexto("Año de Fundación");
        
        CA.setBounds(200,30,400,20);
        rs.setBounds(50, 80, 100, 20);
        dir.setBounds(50, 150, 100, 20);
        acred.setBounds(50, 210, 100, 20);
        hor.setBounds(310, 80, 200, 20);
        nit.setBounds(310, 150, 100, 20);
        anio.setBounds(310, 210, 200, 20);

        //TextFields
        RazonSocial = new components.campotexto();
        Direccion = new components.campotexto();
        Horario = new components.campotexto();
        NIT = new components.campotexto();
        AnioFundacion = new components.campotexto();

        RazonSocial.setBounds(40, 100, 220, 30);
        Direccion.setBounds(40, 170, 220, 30);
        Horario.setBounds(300, 100, 220, 30);
        NIT.setBounds(300, 170, 220, 30);
        AnioFundacion.setBounds(300, 230, 220, 30);
        
        //RadioButtons
        ButtonGroup grupo = new ButtonGroup();
        si = new components.radioboton("Si");
        no = new components.radioboton("No");
        grupo.add(si);
        grupo.add(no);

        si.setBounds(40, 230, 50, 20);
        no.setBounds(100, 230, 50, 20);
        
        //Botones
        Ingresar = new components.boton("Registar");
        Volver = new components.boton("Volver");

        Ingresar.setBounds(130, 300, 150, 40);
        Volver.setBounds(280, 300, 150, 40);

        Ingresar.addActionListener(this);
        Volver.addActionListener(this);
        
        add(CA);
        add(rs);
        add(dir);
        add(acred);
        add(hor);
        add(nit);
        add(anio);
        add(RazonSocial);
        add(Direccion);
        add(Horario);
        add(NIT);
        add(AnioFundacion);
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

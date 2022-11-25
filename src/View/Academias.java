package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Model.Academia;

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
        CA = new View.Components.titulo("Creación Academia");
        rs = new View.Components.subtexto("Razon Social"); 
        dir = new View.Components.subtexto("Direccion"); 
        acred = new View.Components.subtexto("Acreditada"); 
        hor = new View.Components.subtexto("Horario de Atención"); 
        nit = new View.Components.subtexto("NIT"); 
        anio = new View.Components.subtexto("Año de Fundación");
        
        CA.setBounds(200,30,400,20);
        rs.setBounds(50, 80, 100, 20);
        dir.setBounds(50, 150, 100, 20);
        acred.setBounds(50, 210, 100, 20);
        hor.setBounds(310, 80, 200, 20);
        nit.setBounds(310, 150, 100, 20);
        anio.setBounds(310, 210, 200, 20);

        //TextFields
        RazonSocial = new View.Components.campotexto();
        Direccion = new View.Components.campotexto();
        Horario = new View.Components.campotexto();
        NIT = new View.Components.campotexto();
        AnioFundacion = new View.Components.campotexto();

        RazonSocial.setBounds(40, 100, 220, 30);
        Direccion.setBounds(40, 170, 220, 30);
        Horario.setBounds(300, 100, 220, 30);
        NIT.setBounds(300, 170, 220, 30);
        AnioFundacion.setBounds(300, 230, 220, 30);
        
        //RadioButtons
        ButtonGroup grupo = new ButtonGroup();
        si = new View.Components.radioboton("Si");
        no = new View.Components.radioboton("No");
        grupo.add(si);
        grupo.add(no);

        si.setBounds(40, 230, 50, 20);
        no.setBounds(100, 230, 50, 20);
        
        //Botones
        Ingresar = new View.Components.boton("Registar");
        Volver = new View.Components.boton("Volver");

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
            Academia objeto = new Academia();

            String Acreditado = "";
            if(si.isSelected()){
                Acreditado = "si";
            }
            if(no.isSelected()){
                Acreditado = "no";
            }
            
            objeto.subirData(
                RazonSocial.getText(),
                Direccion.getText(),
                Horario.getText(),
                NIT.getText(),
                AnioFundacion.getText(),
                Acreditado
            );
        }

        if (e.getSource()==Volver){
            dispose();
            new MenuPrincipal();
        }
    }
}

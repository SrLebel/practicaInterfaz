package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Model.Academia;

public class ListaAcademias extends JFrame implements ActionListener{
    Color base = new Color(36, 39, 58);
    Color text = new Color(202, 211, 245);
    Color surface = new Color(73, 77, 100);

    JLabel LA;
    JButton Volver, Recuperar;
    JList<String> Lista;
    String[] NombresAcademias;
    String[] InfoAcademia = new String[6];

    public ListaAcademias(){
        setLayout(null);
        setBounds(50, 50, 600, 400);
        setTitle("Listado de Academias");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(false);
        getContentPane().setBackground(base);

        LA = new View.Components.titulo("Listado de Academias");
        Volver = new View.Components.boton("Volver");
        Recuperar = new View.Components.boton("Recuperar");
        
        String[] nombres = cargarElementos();
        Lista = new JList<String>(nombres);

        Lista.setForeground(text);
        Lista.setBackground(surface);

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
        Academia objeto = new Academia();
        NombresAcademias = objeto.cargarLista();
        return NombresAcademias;
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==Recuperar){
            Academia objeto = new Academia();
            String seleccion = Lista.getSelectedValue();
            InfoAcademia = objeto.cargarInfo(seleccion);
            JOptionPane.showMessageDialog(null,
            "Nombre: " + seleccion + "\n" +
            "Dirrecion: " + InfoAcademia[0] + "\n" +
            "Horario: " + InfoAcademia[1] + "\n" + 
            "NIT: " + InfoAcademia[2] + "\n" + 
            "Año de Fundación: " + InfoAcademia[3] + "\n" +
            "Acreditada: " + InfoAcademia[4] + "\n"
            );
        }

        if (e.getSource()==Volver){
            dispose();
            new MenuPrincipal();
        }
    }
}

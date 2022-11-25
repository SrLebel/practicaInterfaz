package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Model.ProgramaAcademico;

public class ListaProgramas extends JFrame implements ActionListener{
    Color base = new Color(36, 39, 58);
    Color text = new Color(202, 211, 245);
    Color surface = new Color(73, 77, 100);

    JLabel LA;
    JButton Volver, Recuperar;
    JList<String> Lista;
    String[] NombresProgramas;
    String[] InfoPrograma = new String[4];

    public ListaProgramas(){
        setLayout(null);
        setBounds(50, 50, 600, 400);
        setTitle("Listado de Programas");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(false);
        getContentPane().setBackground(base);

        LA = new View.Components.titulo("Listado de Programas");
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
        ProgramaAcademico objeto = new ProgramaAcademico();
        NombresProgramas = objeto.cargarLista();
        return NombresProgramas;
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==Recuperar){
            ProgramaAcademico objeto = new ProgramaAcademico();
            String seleccion = Lista.getSelectedValue();
            InfoPrograma= objeto.cargarInfo(seleccion);
            JOptionPane.showMessageDialog(null,
            "Nombre: " + seleccion + "\n" +
            "Codigo: " + InfoPrograma[0] + "\n" +
            "Creditos: " + InfoPrograma[1] + "\n" + 
            "Acreditada: " + InfoPrograma[2] + "\n"
            );
        }

        if (e.getSource()==Volver){
            dispose();
            new MenuPrincipal();
        }
    }
}

package Model;
import java.io.*;
import java.util.Scanner;
public class ProgramaAcademico {

    String[] Programas;

    public String[] cargarLista(){
        
        int reps = 0;
        
        try {
            File archivo = new File("src/Model/data/ListaPA.txt");
            Scanner sc1 = new Scanner(archivo);
            Scanner sc2 = new Scanner(archivo);
            String nombre;
            while(sc1.hasNextLine()){
                sc1.nextLine();
                reps++;
            }
            Programas = new String[reps];
            for(int i=0; i<reps; i++){
                nombre = sc2.nextLine();
            Programas[i] = nombre;
            }
            sc1.close();
            sc2.close();
        } catch (Exception e){

        }
        return Programas;
    }

    public String[] cargarInfo(String NombrePrograma){
        String[] info = new String[4];
        String nombre;
        File archivo = new File("src/Model/data/ProgramasAcademicos.txt");
        try{
            Scanner sc = new Scanner(archivo);
            while(true){
                nombre = sc.nextLine();
                if(nombre.equals(NombrePrograma)){
                    break;
                }
            }
            info[0]=sc.nextLine();
            info[1]=sc.nextLine();
            info[2]=sc.nextLine();
            sc.close();
        } catch (Exception e){

        }
        return info;
    }

    public void subirData(String Nombre, String Codigo, String Creditos, String Acreditada){ 
        File archivo = new File("src/Model/data/ProgramasAcademicos.txt");
        File lista = new File("src/Model/data/ListaPA.txt");
        try {
            FileOutputStream fos = new FileOutputStream(archivo,true);
            FileOutputStream fos2 = new FileOutputStream(lista,true);
            PrintWriter fw = new PrintWriter(fos);
            PrintWriter fw2 = new PrintWriter(fos2);
            fw2.println(Nombre);
            fw.println(Nombre);
            fw.println(Codigo);
            fw.println(Creditos);
            fw.println(Acreditada);
            fw2.close();
            fw.close();
        } catch (Exception e) {
            
        }
    }
}
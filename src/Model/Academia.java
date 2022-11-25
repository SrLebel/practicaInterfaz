package Model;

import java.io.*;
import java.util.Scanner;


public class Academia {
    
    private String[] Academia;

    public String[] cargarLista(){
        int reps = 0;
        
        try {
            File archivo = new File("src/Model/data/ListaA.txt");
            Scanner sc1 = new Scanner(archivo);
            Scanner sc2 = new Scanner(archivo);
            String nombre;
            while(sc1.hasNextLine()){
                sc1.nextLine();
                reps++;
            }
            Academia = new String[reps];
            for(int i=0; i<reps; i++){
                nombre = sc2.nextLine();
                Academia[i] = nombre;
            }
            sc1.close();
            sc2.close();
        } catch (Exception e){

        }
        return Academia;
    }

    public String[] cargarInfo(String NombreAcademia){
        String[] info = new String[6];
        String nombre;
        File archivo = new File("src/Model/data/Academias.txt");
        try{
            Scanner sc = new Scanner(archivo);
            while(true){
                nombre = sc.nextLine();
                if(nombre.equals(NombreAcademia)){
                    break;
                }
            }
            info[0]=sc.nextLine();
            info[1]=sc.nextLine();
            info[2]=sc.nextLine();
            info[3]=sc.nextLine();
            info[4]=sc.nextLine();
            sc.close();
        } catch (Exception e){

        }
        return info;
    }

    public void subirData(String Nombre, String Direccion, String Horario, String Nit, String Anio, String Acreditada){ 
        File archivo = new File("src/Model/data/Academias.txt");
        File lista = new File("src/Model/data/ListaA.txt");
        try {
            FileOutputStream fos = new FileOutputStream(archivo,true);
            FileOutputStream fos2 = new FileOutputStream(lista,true);
            PrintWriter fw = new PrintWriter(fos);
            PrintWriter fw2 = new PrintWriter(fos2);
            fw2.println(Nombre);
            fw.println(Nombre);
            fw.println(Direccion);
            fw.println(Horario);
            fw.println(Nit);
            fw.println(Anio);
            fw.println(Acreditada);
            fw2.close();
            fw.close();
        } catch (Exception e) {
            
        }
    }
}
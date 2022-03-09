package boletin25;

import java.io.*;
import java.io.File;
import java.util.*;
import javax.swing.JOptionPane;

public class Metodos25 {
   
    Scanner sc;
    PrintWriter esc;
    BufferedWriter buff;
    
    public static void engadirLibro (File fich){
        try {
            FileWriter ficheiro = new FileWriter(fich, true);
            PrintWriter esc = new PrintWriter(ficheiro);
            esc.println(JOptionPane.showInputDialog("Introduce o nome do libro: ") + " " + 
            JOptionPane.showInputDialog("Introduce o nome do autor: ") + " " +
            Float.parseFloat(JOptionPane.showInputDialog("Introduce o prezo do libro: ")) + " " +
            Integer.parseInt(JOptionPane.showInputDialog("Introduce o número de unidades: ")));
        } catch (IOException ex) {
            System.out.println("Error" + ex.getMessage());        
        }
    }
   
    public void consultarLibro(File fich){
        ArrayList<Libros> lista = visualizarDatos(fich, " ");
        
        String nom = JOptionPane.showInputDialog("Introduce o nome do libro que queiras consultar: ");
        System.out.println("Libro co nome: " + nom);
        for(Libros l : lista){
            if (l.getNome().equals(nom)){
                System.out.println("Prezo= "+l.getPrezo()+"€");
            }else
                System.out.println("Non se atopou o libro co nome: " + nom);
           
        }
    }
   
    public ArrayList<Libros> visualizarDatos(File fich, String del){
        ArrayList<Libros> lista = new ArrayList<>();
        String c = null;
        Libros libro;
       
        try {
            Scanner sc = new Scanner(fich);
            while (sc.hasNextLine()){
            c = sc.nextLine();
            String[] l = c.split(del);
            libro = new Libros();
            lista.add(libro);}
            for( Libros l : lista){
                System.out.println(l);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error");        }
        
        return lista;    
    }
    
   
    public ArrayList<Libros> borrarLibros(File fich){   
        ArrayList<Libros> lista = visualizarDatos(fich, " ");
        for (Libros l : lista){
            if(l.getUnidades() == 0){
                lista.remove(l);
            }
        }
        return lista;
    }
   
    public ArrayList<Libros> modificarPrezo(File fich){
        ArrayList<Libros> lista = visualizarDatos(fich, " ");
        String nom = JOptionPane.showInputDialog("Introduce o nome do libro que queiras modificar o seu prezo: ");
        int novP = Integer.parseInt("Introduce o precio modificado: ");
        for (Libros l : lista){
            if (l.getNome().equals(nom)){
                l.setPrezo(novP);
            }
        }
        return lista;
    }
}

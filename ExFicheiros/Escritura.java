package com.dani.escrituraFicheiro;

import com.dani.lecturaFicheiro.Lectura;
import exficheiros.Xogador;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Escritura {
    
    FileWriter fich;
    PrintWriter escribir;
    BufferedWriter bf;
    Xogador x;
    
    public void escribirNumeros(String nomeFicheiro){
        try {
            //fich = new FileWriter(nomeFicheiro, false); escribir
            fich = new FileWriter(nomeFicheiro); //abrimos fluxo de escritura
            escribir = new PrintWriter(fich);
            escribir.println(1);
            escribir.println(2);
            escribir.println(3);
            escribir.println(4);
            escribir.println(5);
            
            System.out.println("ficheiro creado con éxito");
        } catch (IOException ex) {
            System.out.println(" erro escritura 1 " + ex.getMessage());
        }
        finally{
            escribir.close();
        }
    }
    
     public void engadirNumeros(String nomeFicheiro){
        try {
            //fich = new FileWriter(nomeFicheiro, false); escribir
            fich = new FileWriter(nomeFicheiro, true); //abrimos fluxo de escritura
            escribir = new PrintWriter(fich);
            escribir.println(1);
            escribir.println(2);
            escribir.println(3);
            escribir.println(4);
            escribir.println(5);
            
            System.out.println("ficheiro creado con éxito");
        } catch (IOException ex) {
            System.out.println(" erro escritura 1 " + ex.getMessage());
        }
        finally{
            escribir.close();
        }
    }
     
     public void escribirBuffer(String nomeFich){
        try {
            fich = new FileWriter(nomeFich);
            bf = new BufferedWriter(fich);
            bf.write("aaaaaa\n");
            bf.write("bbbbbb\n");
            bf.write("cccccc\n");
            bf.write("dddddd\n");
            bf.close();
            
            System.out.println("arquivo creado");
        } catch (IOException ex) {
            System.out.println(" erro escritura 2 "+ ex.getMessage());
        }
        finally{
            try {
                fich.close();
            } catch (IOException ex) {
                System.out.println("non se pode pechar o arquivo");            
            }
        }
         
     }
     
     public void escribirObxectos(String nomeFich){
        try {
            fich = new FileWriter(nomeFich);
            escribir = new PrintWriter(fich);
            x = new Xogador("aaaaa",111);
            escribir.println(x);
            escribir.println(new Xogador("bbbb",222));
            x = new Xogador("ccc",333);
            escribir.println(x.getNome()+","+x.getDorsal());
            System.out.println("creado o ficheiro");
        } catch (IOException ex) {
            System.out.println(" erro escritura 3 ");       
        }finally{
            try {
                escribir.close();
                fich.close();
            } catch (IOException ex) {
                System.out.println("non se pode pechar o arquivo");     
            }
        }
     }
     
     public void crearFichNomesXogadores(){
        try {
         Lectura uno = new Lectura();
         ArrayList<Xogador>lista = uno.lerObxetosMeterArray(new File("xogadores.txt"),"\\s,\\s");
            fich= new FileWriter("nomeX.txt");
            
         for(Xogador xo:lista)
             fich.write(xo.getNome());
        } catch (IOException ex) {
            System.out.println("erro lectura/escritura");        
        }
        finally{
            try {
                fich.close();
            } catch (IOException ex) {
                System.out.println("non se pode pechar o ficheiro");            
            }
        }
         
     }
}

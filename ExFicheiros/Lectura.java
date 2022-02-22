package com.dani.lecturaFicheiro;

import exficheiros.Xogador;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lectura {
    Scanner sc;
    public void lerLiña(File fich){
        String nom;
        try {
            sc = new Scanner(fich);
            while(sc.hasNextLine()){
                nom = sc.nextLine();
                System.out.println(nom);
            }
                
        } catch (FileNotFoundException ex) {
            System.out.println(" erro1 "+ ex.getMessage());        
        }
        finally{
            sc.close();
        }
    }
    
    public void lerNome(File fich){
        try {
            sc = new Scanner(fich);
            while(sc.hasNext()){
                System.out.println(sc.next()); //next lee ata un espacio en branco ou \n
            }
        } catch (FileNotFoundException ex) {
            System.out.println(" erro2 "+ ex.toString());        
        }
        finally{
            sc.close();
        }
    }
    
    public void lerConDelimitadores(File fich, String delimitador){
        try {
            sc = new Scanner(fich).useDelimiter(delimitador);
            while(sc.hasNext()){
                System.out.println(sc.next()); 
            }
        } catch (FileNotFoundException ex) {
            System.out.println(" erro3 "+ ex.getMessage()); 
        }
        finally{
            sc.close();
        }
        
    }
    
    public void amosarPares(File fich){  
        String cadea;
        try {
            sc= new Scanner(fich);     
            while(sc.hasNextLine()){
                cadea = sc.nextLine();
                String[] lista = cadea.split(",");
                for(int i=0; i<lista.length; i++){
                    if(Integer.parseInt(lista[i])%2==0)
                    System.out.println(lista[i]);
                }    
            }
            
                    } catch (FileNotFoundException ex) {
            System.out.println(" erro4 "+ ex.getMessage()); 
            }
            finally{
            sc.close();
        }
    }
    
    public void lerObxetos(File fich){
        try {
            String cadea;
            sc = new Scanner(fich);
            while(sc.hasNextLine()){
            /*    cadea = sc.nextLine();
                System.out.println(cadea);*/
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(" erro5 "+ ex.getMessage());        
        }
        finally{
            sc.close();
        }
    }
    
     public ArrayList<Xogador> lerObxetosMeterArray(File fich, String delimitador){
        ArrayList<Xogador>lista = new ArrayList<Xogador>();
        Xogador xo;
        try {
            String cadea;
            sc = new Scanner(fich);
            while(sc.hasNextLine()){
                cadea = sc.nextLine();
                String[] linea = cadea.split(delimitador);
                xo = new Xogador(linea[0], Integer.parseInt(linea[1]));
                lista.add(xo);
            }
            for(Xogador x:lista)
                System.out.println(x);
        } catch (FileNotFoundException ex) {
            System.out.println(" erro5 "+ ex.getMessage());        
        }
        finally{
            sc.close();
        }
        return lista;
    }
}

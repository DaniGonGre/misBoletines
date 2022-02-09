package libreria;

import java.util.ArrayList;
import libreriaDani.lerDatos;

public class Libreria {
    
      public static void engadir (ArrayList <Libros> lista){
        String titulo;
        String autor;
        String ISBN;
        float prezo;
        int stock;
        Libros aux;
        int i, numP;
        
        do {
            numP = lerDatos.lerInt("Número de libros: ");
             
        } while (numP<0);
        
        for (i=1; i<=numP; i++){
//            System.out.println("Producto " + i);
            titulo = lerDatos.lerString("Introduce o título do libro: ");
            autor = lerDatos.lerString("Introduce o nome do autor: ");
            ISBN = lerDatos.lerString("Introduce o ISBN: ");
            prezo = lerDatos.lerFloat("Introduce o prezo do libro: ");
            stock = lerDatos.lerInt("Introduce o número de unidades: ");
            
            aux = new Libros();
            
            aux.setTitulo(titulo);
            aux.setAutor(autor);
            aux.setISBN(ISBN);
            aux.setPrezo(numP);
            aux.setNumU(stock);
            
            lista.add(aux);
        }
    }
        
      public static void eliminarLibros (ArrayList <Libros> lista){
        lista.removeAll(lista);
        
    }
        public static void amosarLibro (ArrayList<Libros>lista){
        for(int i= 0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
        
        public static void darDeBaixa(ArrayList<Libros>lista){
            
        }
    
        public static void consultarLibro(ArrayList<Libros>lista){
        int cod = lerDatos.lerInt("Introduce o ISBN do libro que queiras consultar: ");
        System.out.println("Libro con el ISBN: " + cod);
        for(int i=0; i<lista.size(); i++){
            if (lista.get(i).getISBN().equals(cod))
                System.out.println(lista.get(i));
            
        }
    }
}

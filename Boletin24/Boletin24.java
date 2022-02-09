package boletin24;

import java.util.ArrayList;
import libreriaDani.lerDatos;

public class Boletin24 {

    public static void main(String[] args) {

                ArrayList <Libros> lista = new ArrayList();
        
        int op; 
        
            do{
                
            op = lerDatos.lerInt(" **** MENU ****" + 
            "\n0 --> Saír do programa \n1 --> Engadir libro \n2 --> Eliminar libro"
            + "\n3 --> Amosar libro\n4 --> Dar de baixa nº=0\n5 --> Consultar libro" );
            
            switch (op){
                case 1 : Libreria.engadir(lista);
                        break;
                case 2 : Libreria.eliminarLibros(lista);
                        break;
                case 3 : Libreria.amosarLibro(lista);
                        break;
                case 4 : Libreria.darDeBaixa(lista);
                        break;
                case 5 : Libreria.consultarLibro(lista);
            } 
            } while(op!=0);
    }

    }

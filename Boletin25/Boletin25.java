package boletin25;

import java.io.File;
import javax.swing.JOptionPane;

public class Boletin25 {

    public static void main(String[] args) {       
        
        Metodos25 ficheiro = new Metodos25();
        File fich = new File("ficheroLibros.txt");
       
        int op;
       
            do{
               
            op = Integer.parseInt(JOptionPane.showInputDialog(" **** MENU ****" +
            "\n0 --> Saír do programa \n1 --> Engadir libro \n2 --> Consultar libro"
            + "\n3 --> Visualizar datos\n4 --> Borrar libros con 0u\n5 --> Modificar prezo"));
           
            switch (op){
                case 1 : Metodos25.engadirLibro(fich);
                        break;
                case 2 : ficheiro.consultarLibro(fich);
                        break;
                case 3 : ficheiro.visualizarDatos(fich, " ");
                        break;
                case 4 : ficheiro.borrarLibros(fich);
                        break;
                case 5 : ficheiro.modificarPrezo(fich);
            }
            } while(op!=0);
    }
}

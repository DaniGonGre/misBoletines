package exficheiros;

import com.dani.escrituraFicheiro.Escritura;
import com.dani.lecturaFicheiro.Lectura;
import java.io.File;

public class ExFicheiros {

    public static void main(String[] args) {

        Lectura obxLec = new Lectura();
    /*  File fic = new File("nomes.txt"); //pq está no directorio raíz
        obxLec.lerLiña(fic);
        File f = new File("/home/dam1/Documentos/Programacion/numeros.txt");
        obxLec.lerLiña(f);
        File fic = new File("nomes.txt"); 
        obxLec.lerNome(fic);
        File fic = new File("nomes.txt"); 
        obxLec.lerConDelimitadores(fic, ",");
        
        File f = new File("/home/dam1/Documentos/Programacion/numeros.txt");
        obxLec.amosarPares(f);
        File fi = new File("xogadores.txt");
        obxLec.lerObxetosMeterArray(fi, "\\s*,\\s*");*/
        
        File fi = new File("xogadores.txt");        
        obxLec.lerNome(fi);
        obxLec.lerObxetosMeterArray(fi, "\\s*,\\s*");
        
        Escritura esc = new Escritura();
    /*  esc.engadirNumeros("numEnteiros.txt");
        esc.escribirBuffer("nomesBuff.txt");*/
    //    esc.escribirObxectos("escribirXogadores");
        
//leer del fichero jugadores que nos envia un ArrayList y escribir en ficheiro nomeXogadores os seus nomes
    }
    
}

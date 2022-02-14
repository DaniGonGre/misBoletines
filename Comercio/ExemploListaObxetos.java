package exemplolistaobxetos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import libreriaDani.lerDatos;

public class ExemploListaObxetos {

    public static void main(String[] args) {

        ArrayList <Producto> lista = new ArrayList();
        
        int op; 
        
            do{
                
            op = lerDatos.lerInt(" **** MENU ****" + 
            "\n0 --> Saír do programa \n1 --> Engadir producto \n2 --> Amosar producto"
            + "\n3 --> Eliminar producto\n4 --> Consultar producto" );
            
            switch (op){
                case 1 : Comercio.engadir(lista);
                        break;
                case 2 : Comercio.amosarProducto(lista);
                        break;
                case 3 : Comercio.eliminar(lista);
                        break;
                case 4 : Comercio.consultarCodigo(lista);
            } 
            } while(op!=0);
    }
 
}

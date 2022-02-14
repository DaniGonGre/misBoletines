
package exemplolistaobxetos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import libreriaDani.lerDatos;

public class Comercio {
 
    //Método añadir producto
    public static void engadir (ArrayList <Producto> lista){
        int codigo;
        String nome;
        String tipo;
        float prezo;
        int stock;
        Producto aux;
        int i, numP;
        
        do {
            numP = lerDatos.lerInt("Número de productos: ");
             
        } while (numP<0);
        
        for (i=1; i<=numP; i++){
//            System.out.println("Producto " + i);
            codigo = lerDatos.lerInt("Introduce o código do producto: ");
            nome = lerDatos.lerString("Introduce o nome do producto: ");
            tipo = lerDatos.lerString("Introduce o tipo do producto: ");
            prezo = lerDatos.lerFloat("Introduce o prezo do producto: ");
            stock = lerDatos.lerInt("Introduce o stock: ");
            
            aux = new Producto();
            
            aux.setCodigo(codigo);
            aux.setNome(nome);
            aux.setPrezo(prezo);
            aux.setStock(stock);
            aux.setTipo(tipo);
            
            lista.add(aux);
        }
    }
    
    //Método visualizar producto invocando el método toString de la clase
    public static void amosarProducto (ArrayList<Producto>lista){
        for(int i= 0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
    
    //Método eliminar os productos rexistrador
    public static void eliminar (ArrayList <Producto> lista){
//        int eliminar = lerDatos.lerInt("Introduce o número do producto que queras eliminar: ");
        lista.removeAll(lista);
        
//        System.out.println(lista);
    }
    
    //Método para consultar producto polo seu código
    public static void consultarCodigo(ArrayList<Producto>lista){
        int cod = lerDatos.lerInt("Introduce o código que queras consultar: ");
        System.out.println("Producto con el código " + cod);
        for(int i=0; i<lista.size(); i++){
            if (lista.get(i).getCodigo()==cod)
                System.out.println(lista.get(i));
            
        }
    }
    
     //obter = comprar
    
}

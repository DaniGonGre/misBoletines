package boletin33;

import java.util.ArrayList;
import java.util.Collections;

public class Operacions <T extends Comparable> {
    
    int max, min;    
    
    public void elMin(ArrayList<T> listaInt){
        
        T min = (T) Collections.min(listaInt);
        System.out.println("O número mínimo do array é " + min);
        
    }
    
    public void elMax(ArrayList<T> listaInt){
        
        T max = (T) Collections.max(listaInt);
        System.out.println("O número máximo do array é " + max);
        
        /*
          T max = (T) lista.get(0);
          for(int i = 1; i<lista.size(); i++){
            if(max.compareTo (lista.get(i))<0)
                max = lista.get(i);
            }
          System.out.println("O número mínimo do array é " + max);
         */
    }
    
    public void busAl(ArrayList<T> listaAl){
        
        
        
    }
        
}
    
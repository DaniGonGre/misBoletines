package boletin21_3;

import javax.swing.JOptionPane;

public class ArrayNomes {
    
    public static float[] crearArray(float nota[], String nome[]){
        
        for(int i=0; i<nota.length; i++){
            nota[i] = (float) (Math.random()*10);
            nome[0]="pedro"; nome[1]="jose"; nome[2]="juan"; nome[3]="nahum"; 
            nome[4]="olalla";          
        }
        return nota;
    }
    
    public static void amosar(float nota[], String nome[]){
    
       for(int i=0; i<nota.length; i++ ){
           System.out.println(nome[i] + " --> "+ nota[i]);
       }
    }
    
    public static int consultarNota(String nome[], float nota[] ){
        String buscarNom = JOptionPane.showInputDialog("Consultar o seguinte alumno: ");
        int pos=0, nonEsta=0;
        
        for(int j=0; j<nome.length; j++){
            if(buscarNom.equals(nome[j])){
                System.out.println(nota[j]);
                pos=j;
                nonEsta=1;
                break;
            }
        }
        if(nonEsta==0){
            System.out.println("Este nome non se corresponde con ningún");
            pos=-1;
        }
        return pos;
    }
    
        public static void ordearNotas(float nota[], String nome[]){
            float auxNota=0;
            String auxNome=null;
            
            for(int i=0; i<nota.length-1; i++){
                for(int j=i+1; j<nota.length;j++){
                    if(nota[i]>nota[j]){
                        auxNota=nota[i];
                        nota[i]=nota[j];
                        nota[j]=auxNota;
                        auxNome=nome[i];
                        nome[i]=nome[j];
                        nome[j]=auxNome;
                    }
                }
                System.out.println("O alumno " + nome[i] + " sacou un " + nota[i]);
            } 
        }
    
        public static void aprobar(float nota[], String nome[]){
        int aprobado=0;
        for (int k=0; k<nota.length; k++ ){
            if(nota[k]>=5){
                aprobado++;
                System.out.println("Os seguintes alumnos aprobaron: " + nome[k]);
            }
        }
        
        
    }
    
}

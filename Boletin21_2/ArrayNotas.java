package boletin21_2;

public class ArrayNotas {
    
    public static float[] crearNotas(float[] nota){
        
    for (int i=0; i<nota.length; i++){
        nota[i] = (float) (Math.random()*10);
    }
    return nota;
  }


    public static void calificarNotas(float[] nota){
        
        int suspenso=0, aprobado=0;
        
        for (int j=0; j<nota.length; j++){
            if (nota[j]>=5){
                aprobado++;
            } else{
                suspenso++;
            }
        }   
        System.out.println("Aprobaron " + aprobado + " e " + "suspenderon " + suspenso );

}
    
     public static void mediaNotas(float[] nota){
         float total=0;
         for (int k=0; k<nota.length; k++){
             total+=nota[k];
        }
        System.out.println("A nota media da clase é de " + total/nota.length);

     }
     
     public static void notaAlta(float[] nota){
         float alta= nota[0];
         
         for (int l=0; l<nota.length; l++){
             if (alta < nota[l]){
                 alta = nota[l];
             }
         }
         System.out.println("A nota máis alta é un " + alta);
     }
}

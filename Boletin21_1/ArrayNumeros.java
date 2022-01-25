package boletin21_1;

public class ArrayNumeros {

    public static int[] arrayNumeros(int[] numeros){
        for (int i=0; i<numeros.length; i++){
            numeros[i] = (int) (Math.random()*49+1);
            
            System.out.println(numeros[i]);
        }
        return numeros;
    }

    public static void invertirAmosar(int[] numeros){
        System.out.println("Invertidos");
        for (int j= numeros.length-1; j>=0; j--)
            System.out.println(numeros[j]);
        }   
    }

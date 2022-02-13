package boletin23;

import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;
import static sun.security.krb5.Confounder.bytes;

public class Metodos23 {
 
      public static void lonxTexto(){
       
        String texto = "Esto é  Java!";
        //int lonx = texto.length();
       
        System.out.println("A lonxitude é de "+texto.length()+" caracteres.");
    }
   
    public static void desmTexto(){
        String texto = "Java";
        String split[] = texto.split("");
        for (int i=0; i<split.length; i++){
            System.out.println(split[i]);
        }
    }
   
    public static void invertTexto(){
        String texto = "Java desde 0";
        String invertida = "";
        for (int i=texto.length()-1; i >=0; i--){
            invertida += texto.charAt(i);
        }
        System.out.println(invertida);
    }
   
    public static void senEspazos(){
        String texto = "James Gosling Created Xava";
        System.out.println(texto.replaceAll("\\s", ""));
    }
   
    public static void contarVeC(){
        String texto = "java java java";
        String sinEsp = texto.replaceAll("\\s", "");
        int vocales = sinEsp.replaceAll("[aeiou]","").length();
        System.out.println("A frase contén "+vocales+" vogais");
        String sinEsp2 = texto.replaceAll("\\s", "");
        int consonantes = sinEsp2.replaceAll("[qwrtypsdfghjklñzxcvbnm]","").length();
        System.out.println("A frase contén "+consonantes+" consonantes");
    }
   
    public static void divTexto(){
        String texto = "www.javadesde0.com";
        String[] parte = texto.split("d", 18);
        StringTokenizer divTexto = new StringTokenizer(texto, "-");
        while (divTexto.hasMoreTokens())
        System.out.println(divTexto.nextToken());
    } 
   
    public static void transMai(){
        String textoMin = "javeros";
        String textoMai = textoMin.toUpperCase();
        System.out.println("Transformación a maiúsculas: "+textoMai);
        System.out.println("Transformación a minúsculas: "+textoMai.toLowerCase());
    }
   
    public static void compTexto(){
        String text1 = "Java";
        String text2 = "JavaScript";
        if (text1.compareTo(text2) == 0)
            System.out.println("Os textos son iguais.");
        else
            System.out.println("Os textos non son iguais.");
    }
    
    public static void subVogais(){
        String texto = " Jeve jeve jeve";
        for (int i=0; i<texto.length(); i++){
            if (texto.charAt(i) == 'e'){
                texto = texto.replace("e", "a");
            }
        }
        System.out.println(texto);
    }
    
    public static void transString(){
        String caracter = " ABCD";
        byte[] valor = caracter.getBytes(StandardCharsets.US_ASCII);
        for (int i=0; i<valor.length; i++)
            System.out.println("Valor en ASCII: " + valor[i]);
    }
    
    public static void contCaract(){
        String cadea = "Ola, son alumno de DAM1, e son programador desde o 2021";
        int letra = 0;
        int dixitos = 0;
        int espazos = 0;
        for (int i=0; i<cadea.length(); i++){
            if (cadea.charAt(i) >= 'a' && cadea.charAt(i) <= 'z' || cadea.charAt(i) >= 'A' && cadea.charAt(i) <= 'Z'){
                letra++;
            } else if (cadea.charAt(i) >= '0' && cadea.charAt(i) <= '9'){
                dixitos++;
            } else if (cadea.charAt(i) == ' '){
                espazos++;
            }
            
        }
        System.out.println("Nº letras: " + letra + "\nNº de díxitos: " + dixitos + "\nNº de espazos: " + espazos);
    }
   
    
}

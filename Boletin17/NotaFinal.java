package boletin_17;

import javax.swing.JOptionPane;

public class NotaFinal {
  
    float pe1, pe2, pteo, boletins, pPractica, pEscrita, notaTotal;

    public void pedirNotas(){

    pe1= Float.parseFloat(JOptionPane.showInputDialog("Introduce a nota da 1º proba escrita: "));
    pe2= Float.parseFloat(JOptionPane.showInputDialog("Introduce a nota da 2º proba escrita: "));
    pPractica= Float.parseFloat(JOptionPane.showInputDialog("Introduce a nota da proba práctica: "));
    boletins= Float.parseFloat(JOptionPane.showInputDialog("Indica a porcentaxe de boletins: "));
    }
    
    public void calcularNota(){
    pEscrita= (pe1+pe2)/2;

    if (boletins > 90){
        boletins= 2;
    } else{
        if (boletins > 70 && boletins < 90){
            boletins= 1;
        } else{
            boletins= 0;
        }
    }   
}
    public void calcularFinal(){
        notaTotal = (pEscrita*40/100)+ (pPractica*40/100) + boletins;
    }
    
    public void mostrarNota(){
        System.out.println("PROBAS TEÓRICAS: " + pEscrita + '\n' + 
        "PROBAS PRÁCTICAS: " + pPractica + "\n" + "BOLETINS: " + boletins
        + '\n' + "NOTA TOTAL: " + notaTotal);
    }
  
}

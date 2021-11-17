package boletin6_1;

public class Coche {
    int velocidade;
    
     public Coche(){
        velocidade=0;
    }
    
    public Coche(int v, int vInicial, int vFinal, int t){
        v= velocidade;
    }
    
    public void setVelocidade(int v){
        velocidade = v;
        System.out.println("Velocidade: "+ velocidade);
    }
    
    public void setAcelerar(int valor){
        int aceleracion = velocidade + valor;
        System.out.println("Aceleración: "+ aceleracion);
    }
    
    public void setFrenar (int menos){
        int frenar= velocidade - menos;
        System.out.println("Freno: "+ frenar);
    }
    
    public int getVelocidade(){
        return velocidade;
    }
    
}

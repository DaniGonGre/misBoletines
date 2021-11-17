package boletin6_3;

public class Circulo {
   
    double radio;
    final double PI = 3.14;
    
    public Circulo(){
        double radio = 0;
    }
    
    public Circulo(double r){
        radio = r;
    }
    
    public void setCalcularArea(){
        double area = PI * (Math.pow(radio, 2));
        System.out.println("Área= "+ area);
    }
    
    public void setCalcularLonxitude(){
        double lonxitude = 2*PI*radio;
        System.out.println("Lonxitude=" + lonxitude);
    }
    
}

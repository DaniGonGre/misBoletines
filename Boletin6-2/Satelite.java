package boletin6_2;

public class Satelite {
    
    double meridiano, paralelo, distancia;
    
    public Satelite(){
        meridiano = paralelo = distancia = 0;
    }
    
    public Satelite(double mer, double par, double dis ){
        meridiano= mer;
        paralelo= par;
        distancia= dis;
    }
    
    public void verPosicion(){
        System.out.println("Meridiano= "+ meridiano + "\n"+ 
                "Paralelo= "+ paralelo + "\n"+ "Distancia da terra= "+ distancia);
    }
}

package boletin32;

public class Yate extends Barco{
    
    float potencia;
    int camarotes;

    public Yate(float potencia, int camarotes, String matricula, float eslora) {
        super(matricula, eslora);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }
    
    public float calcularPrezo(int dias){
        return(((2*this.potencia)+(25*this.camarotes))*dias);
    }
    
}

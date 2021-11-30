package boletin14;

public class Revista extends Publicacions {
    
    private int numero;

    public Revista() {
    }

    public Revista(String codigo, String titulo, int anoPublicacion, int numero){
        super(codigo, titulo, anoPublicacion);
        this.numero = numero;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    @Override
    public String toString(){
        return super.toString() + "numero= " + numero;
    }
    
}

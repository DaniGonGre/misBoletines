package boletin14;

    public class Libro extends Publicacions{
    
    private boolean prestado;

    public Libro() {
    }

    public Libro(String codigo, String titulo, int anoPublicacion, boolean prestado){
        super(codigo, titulo, anoPublicacion);
        this.prestado = prestado;
    }
    
    public boolean getPrestado(){
        return prestado;
    }
    
    public void setPrestado(boolean prestado){
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return super.toString() + "prestado=" + prestado;
    }
}

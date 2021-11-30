package boletin15;

public class Pelicula extends Multimedia{
    
    private String actorP;
    private String actrizP;

    public Pelicula() {
    }

    public Pelicula(String actorP, String actrizP) {
        this.actorP = actorP;
        this.actrizP = actrizP;
    }

    public Pelicula(String actorP, String actrizP, String titulo, String autor, String formato, int duracion) {
        super(titulo, autor, formato, duracion);
        this.actorP = actorP;
        this.actrizP = actrizP;
    }

    public void setActorP(String actorP) {
        this.actorP = actorP;
    }

    public void setActrizP(String actrizP) {
        this.actrizP = actrizP;
    }

    @Override
    public String toString() {
        return  super.toString() + "actorP=" + actorP + ", actrizP=" + actrizP;
    }
    
    
}

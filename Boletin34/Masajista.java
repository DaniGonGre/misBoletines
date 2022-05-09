package boletin34;

public class Masajista extends SeleccionFutbol{
 
    private String titulacion;
    private int añosExperiencia;

    public Masajista() {
    }

    public Masajista(String titulacion, int añosExperiencia) {
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public Masajista(String titulacion, int añosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public String toString() {
        return "titulacion= " + titulacion + ", a\u00f1osExperiencia= " + añosExperiencia;
    }
    
    public void darMasaje(){
        System.out.println("dar masaje");        
    }

    @Override
    public void concentrarse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void viajar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void entrenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void jugarPartido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

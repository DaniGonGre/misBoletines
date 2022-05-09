package boletin34;

public class Seleccionador extends SeleccionFutbol{
    
    private String nome; 
    private int id;
    private String apellidos;
    private int edad;
    
    public void seleccionarXogador(){
        System.out.println("seleccionar xogador");
    }

    public Seleccionador() {
    }

    public Seleccionador(String nome, int id, String apellidos, int edad) {
        this.nome = nome;
        this.id = id;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nome= " + nome + ", id= " + id + ", apellidos= " + apellidos + ", edad= " + edad;
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

package boletin34;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
   
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;
    
    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "id= " + id + ", nombre= " + nombre + ", apellidos= " + apellidos + ", edad= " + edad;
    }
    
    
    
}

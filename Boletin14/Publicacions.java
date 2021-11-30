package boletin14;

public class Publicacions {
    private String codigo;
    private String titulo;
    private int anoPublicacion;

    public Publicacions() {
    }

    public Publicacions(String codigo, String titulo, int anoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public int getAnoPublicacion() {
        return anoPublicacion;
    }
    
    public void setAnoPublicacion(int anoPublicacion){
        this.anoPublicacion = anoPublicacion;
    }
    
    @Override
    public String toString() {
        return "codigo=" + codigo + ", titulo=" + titulo + ", anoPublicacion=" + anoPublicacion;
    }
    
}

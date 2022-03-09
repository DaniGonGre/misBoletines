package boletin25;

public class Libros {
   
    private String nome, autor;
    private float prezo;
    private int unidades;

    public Libros() {
    }

    public Libros(String nome, String autor, float precio, int unidades) {
        this.nome = nome;
        this.autor = autor;
        this.prezo = prezo;
        this.unidades = unidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float precio) {
        this.prezo = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", autor=" + autor + ", prezo=" + prezo + ", unidades=" + unidades;
    }
   
   
   
}

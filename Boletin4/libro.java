package boletin4;

public class libro {

    //atributos

    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;

    //constructores
    public libro() {

    }

    public libro(String tit, String aut, int an, short numPag) {
        titulo = tit;      //tambien podria ponerse this.titulo= titulo;
        autor = aut;
        ano = an;
        numPaginas = numPag;

    }

    //metodos de acceso

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public short getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(short numPaginas) {
        this.numPaginas = numPaginas;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public void amosar() {
        System.out.println("titulo: "+ titulo + "/n autor: "+autor+ "/n ano"+ano +"/n numeroPáxinas: "+numPaginas+
                "/n valoracion: "+valoracion)
    }

}
    /*public String toString(){
        return "El libro "+titulo+ " creado por el autor "+autor+
                " fue publicado en el año "+ano+ " y tiene "+numPaginas+" páginas. "
                + "Tiene una valoración de "+valoracion;


    }


}

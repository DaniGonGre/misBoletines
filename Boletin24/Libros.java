package boletin24;

import java.util.Objects;

public class Libros {
    private String titulo;
    private String autor;
    private String ISBN;
    private int prezo;
    private int stock;

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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPrezo() {
        return prezo;
    }

    public void setPrezo(int prezo) {
        this.prezo = prezo;
    }

    public int getStock() {
        return stock;
    }

    public void setNumU(int numU) {
        this.stock = numU;
    }

    @Override
    public String toString() {
        return "Titulo= " + titulo + ", autor= " + autor + ", ISBN= " + ISBN + ", prezo= " + prezo + ", numU= " + stock;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.titulo);
        hash = 59 * hash + Objects.hashCode(this.autor);
        hash = 59 * hash + Objects.hashCode(this.ISBN);
        hash = 59 * hash + this.prezo;
        hash = 59 * hash + this.stock;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libros other = (Libros) obj;
        if (this.prezo != other.prezo) {
            return false;
        }
        if (this.stock != other.stock) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.ISBN, other.ISBN)) {
            return false;
        }
        return true;
    }
    
    
    
}

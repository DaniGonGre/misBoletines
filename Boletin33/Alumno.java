package boletin33;

public class Alumno {

    String nome;
    int idade;

    public Alumno() {
    }
    
    public Alumno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", idade=" + idade;
    }   
}

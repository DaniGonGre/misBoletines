package entidades;

public class EContratado extends Empregado{

    private int soldoBasico;
    private int tempoTraballado;

    public EContratado() {
    }

    public EContratado(int soldoBasico, int tempoTraballado) {
        this.soldoBasico = soldoBasico;
        this.tempoTraballado = tempoTraballado;
    }

    public EContratado(int soldoBasico, int tempoTraballado, int dni, String nome, String apelidos, int dataIngreso) {
        super(dni, nome, apelidos, dataIngreso);
        this.soldoBasico = soldoBasico;
        this.tempoTraballado = tempoTraballado;
    } 
}

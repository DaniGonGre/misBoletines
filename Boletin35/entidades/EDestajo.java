package entidades;

public class EDestajo extends Empregado{
    
    private int nClientes;
    private int cClientes;

    public EDestajo() {
    }

    public EDestajo(int nClientes, int cClientes) {
        this.nClientes = nClientes;
        this.cClientes = cClientes;
    }

    public EDestajo(int nClientes, int cClientes, int dni, String nome, String apelidos, int dataIngreso) {
        super(dni, nome, apelidos, dataIngreso);
        this.nClientes = nClientes;
        this.cClientes = cClientes;
    }
    
    
    
}

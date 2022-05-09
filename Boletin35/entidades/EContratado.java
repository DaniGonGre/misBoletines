package entidades;

public class EContratado extends Empregado{

    private int soldoBasico;
    private int tempoTraballado;
    private int porcentaxeAdicional;

    public EContratado() {
    }

    public EContratado(int soldoBasico, int tempoTraballado, int porcentaxeAdicional) {
        this.soldoBasico = soldoBasico;
        this.tempoTraballado = tempoTraballado;
        this.porcentaxeAdicional = porcentaxeAdicional;
    }

    public EContratado(int soldoBasico, int tempoTraballado, int porcentaxeAdicional, int dni, String nome, String apelidos, int dataIngreso) {
        super(dni, nome, apelidos, dataIngreso);
        this.soldoBasico = soldoBasico;
        this.tempoTraballado = tempoTraballado;
        this.porcentaxeAdicional = porcentaxeAdicional;
    }
    
    public int porAdi(int tempoTraballado , int porcentaxeAdicional){
        
        if (tempoTraballado > 0 && tempoTraballado <= 3){
            this.porcentaxeAdicional = 5/100;
        } else if (tempoTraballado >= 4 && tempoTraballado <= 7){
            this.porcentaxeAdicional = 10/100;
        } else if (tempoTraballado >= 8 && tempoTraballado <= 15){
            this.porcentaxeAdicional = 15/100;
        } else if (tempoTraballado > 15){
            this.porcentaxeAdicional = 20/100;
        }
        
        return porcentaxeAdicional;
    }
    
}

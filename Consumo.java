package boletin5;

public class Consumo {
    //atributos

    private double km;       //kilómetros percorridos polo coche
    private double litros;  //litros de combustible consumidos
    private double vMed;   //velocidade media
    private double pGas;  //prezo da gasolina

    //constructores
    public Consumo(){

    }

    public Consumo(double km, double litros, double vMed, double pGas) {
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;

    }

    //metodos de acceso
    public double getTempo(){
        return km/vMed;
    }

    public double getconsumoMedio(){
        return (litros*100)/km;
    }

    public double getconsumoEuros(){
        return pGas*getconsumoMedio();
    }

    public void setKms(double km){
        this.km = km;
    }

    public void setLitros(double litros){
        this.litros = litros;
    }

    public void setvMed(double vMed){
        this.vMed = vMed;
    }

    public void setpGas(double pGas){
        this.pGas = pGas;
    }

    public void amosarConM(){
        System.out.println("Consumo medio"+ getconsumoMedio());
    }

    public void amosarvMed(){
    System.out.println("Velocidade media"+ vMed);
    }


}

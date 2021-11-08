package boletin3.pkg5;
import java.util.Scanner;

public class Boletin3_5 {

    public static void main(String[] args) {
        final int retencion=36, eurosDia=30, eurosKm=2;
        final double comisionVenta= 0.05, irpf= 0.18;
        double salarioFijo, importeVentas, kilometrosDesplazados;
        int diasFuera;
        
        Scanner sc= new Scanner (System.in);
        
        System.out.println("Valor del salario fijo: ");
        salarioFijo= sc.nextDouble();
        
        System.out.println("Valor del importe total: ");
        importeVentas= sc.nextDouble();
        
        System.out.println("Valor de los km totales: ");
        kilometrosDesplazados= sc.nextDouble();
        
        System.out.println("Días totales de viaje de negocios: ");
        diasFuera= sc.nextInt();
        
        double salarioBruto= salarioFijo + importeVentas* comisionVenta + 
        kilometrosDesplazados* eurosKm + diasFuera* eurosDia;
        double salarioLiquido= salarioBruto* (1- irpf)- retencion;
        
        salarioBruto = Math.round(salarioBruto*100.0)/100.0;
        salarioLiquido = Math.round(salarioLiquido*100.0)/100.0;
        
        System.out.println("Salario bruto= "+ salarioBruto + "\n" + "Salario líquido= "+ salarioLiquido);
                
        
    }
    
}

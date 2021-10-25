package boletin5;

import java.util.Scanner;

public class boletin5 {

    public static void main(String[] args) {

        //pedir datos
        Scanner sc = new Scanner(System.in);

        System.out.println("Kilometros percorridos polo coche: ");
        double km = sc.nextDouble();

        System.out.println("Litros de combustible consumidos: ");
        double litros = sc.nextDouble();

        System.out.println("Velocidad media: ");
        double vMed = sc.nextDouble();

        System.out.println("Prezo da gasolina: ");
        double pGas = sc.nextDouble();

        //valores do enunciado obxeto 1

        Consumo obxCon1 = new Consumo();
        obxCon1.setLitros(50);
        obxCon1.setpGas(1.57);

        //valores obxeto 2
        litros= 56;

        Consumo obxCon2 = new Consumo(km, litros, vMed, pGas);
        obxCon2.amosarConM();
        obxCon2.amosarvMed();
    }
}

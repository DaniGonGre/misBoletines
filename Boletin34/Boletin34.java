package boletin34;

import java.util.ArrayList;

public class Boletin34 {

    public static void main(String[] args) {

        ArrayList <SeleccionFutbol> lista = new ArrayList<>();
        
        SeleccionFutbol obxF = new Futbolista(7, "delantero");
        obxF.toString();
        
        SeleccionFutbol obxM = new Masajista("doctorado", 10);
        obxM.toString();
        
        SeleccionFutbol obxE = new Entrenador(62389);
        obxE.toString();
        
        SeleccionFutbol obxS = new Seleccionador("Juan", 3287, "Lopez", 22);
        obxS.toString();

        lista.add(obxF);
        lista.add(obxM);
        lista.add(obxE);
        lista.add(obxS);
        
        for (SeleccionFutbol sf : lista){
            System.out.println(sf.toString());
        }
    }
    

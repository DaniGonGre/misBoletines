package boletin33;

import java.util.ArrayList;

public class Boletin33 {

    public static void main(String[] args) {

        ArrayList <Integer> listaInt = new ArrayList<>();
            listaInt.add(8);
            listaInt.add(17);
            listaInt.add(3);
            listaInt.add(24);
            listaInt.add(65);
            
            System.out.println(listaInt);
        
        Operacions obx = new Operacions();
        obx.elMax(listaInt);
        obx.elMin(listaInt);
        
        
        ArrayList <Alumno> listaAl = new ArrayList<>();
            listaAl.add(new Alumno("Pedro", 7));
            listaAl.add(new Alumno("Juan", 6));
            listaAl.add(new Alumno("Mario", 9));
            listaAl.add(new Alumno("Marta", 3));
            listaAl.add(new Alumno("Josefa", 5));        
        
        Operacions obx2 = new Operacions();
        obx2.busAl(listaAl);
    }
}

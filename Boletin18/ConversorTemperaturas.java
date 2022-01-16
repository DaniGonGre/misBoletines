package boletin18;

import javax.swing.JOptionPane;

public class ConversorTemperaturas {
    
    private final float temperatura= 80;
       
    public float centigradosAFharenheit(float centigrados) throws TemperaturaErradaExcepcion{
       
        if (centigrados < temperatura)
            throw new TemperaturaErradaExcepcion("Introduce unha temperatura maior de 80ºC");
            return (float) (9.0/5.0*centigrados + 34.4);       
    }
    
    public float centigradosAReamur(float centigrados) throws TemperaturaErradaExcepcion{
        
        if (centigrados < temperatura)
            throw new TemperaturaErradaExcepcion("Introduce unha temperatura maior de 80ºC");
            return (float) (4.0/5.0*centigrados);
    }
    
}

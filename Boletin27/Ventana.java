package boletin27;

import java.awt.FlowLayout;
import javax.swing.*;

public class Ventana {
    JFrame marco;
    JPanel panel1, panel2;
    JButton boton1, boton2, boton3;
    JTextField liñaTexto1;
    JPasswordField liñaTexto2;
    JLabel etiqueta1, etiqueta2;
    JTextArea areaTexto2;
    JList lista;
    
    public void compoñentes(){       
        marco = new JFrame();
        marco.setSize(600, 600);
        
        //compoñentes panel 1
        panel1 = new JPanel();
        panel1.setSize(600, 300);        
        boton1 = new JButton("PREMER");
        boton2 = new JButton("LIMPAR");
        liñaTexto1 = new JTextField();
        liñaTexto2 = new JPasswordField();
        etiqueta1 = new JLabel("NOME");
        etiqueta2 = new JLabel("PASSWORD");
        
        //compoñentes panel 2
        panel2 = new JPanel();
        panel2.setSize(600, 300);
        boton3 = new JButton("BOTON");
        String element[] = { "ElementoLista1", "ElementoLista2", "ElementoLista3" };
        lista = new JList(element);
        areaTexto2 = new JTextArea();
    }
    
    public void pecharVentana(){
        panel2.setLayout(null);
        panel1.setLayout(null);
        marco.setLocationRelativeTo(marco); 
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        marco.setVisible(true);  
    }
    
    public void interfaz(){
        this.compoñentes();

        //interfaz panel 1
        boton1.setBounds(100, 250, 150, 40);
        boton2.setBounds(350, 250, 150, 40);
        etiqueta1.setBounds(100, 25, 100, 100);
        etiqueta2.setBounds(100, 125, 100, 100);
        liñaTexto1.setBounds(200, 50, 300, 50);
        liñaTexto2.setBounds(200, 150, 300, 50);
        panel1.add(boton1);
        panel1.add(boton2);
        panel1.add(etiqueta1);
        panel1.add(etiqueta2);
        panel1.add(liñaTexto1);
        panel1.add(liñaTexto2);
        marco.add(panel1);
        
        //interfaz panel 2
        boton3.setBounds(225, 400, 150, 40);
        
        lista.setBounds(25, 350, 150, 150);
        areaTexto2.setBounds(400, 375, 150, 150);
        panel2.add(lista);
        panel2.add(boton3);
        panel2.add(areaTexto2);
        marco.add(panel2);
        
        this.pecharVentana();
        
    }
    
}

package boletin26;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class InterfazGrafica implements ActionListener{

    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;
    JTextField liñaTexto1;
    JPasswordField liñaTexto2;
    JLabel etiqueta1, etiqueta2;
    JTextArea areaTexto;
    
    public void compoñentes(){       
        marco = new JFrame();
        marco.setSize(600, 600);
        panel = new JPanel();
        panel.setSize(600, 600);
        boton1 = new JButton("PREMER");
        boton2 = new JButton("LIMPAR");
        liñaTexto1 = new JTextField();
        liñaTexto2 = new JPasswordField();
        etiqueta1 = new JLabel("NOME");
        etiqueta2 = new JLabel("PASSWORD");
        areaTexto = new JTextArea();
        
    }
    
    public void pecharVentana(){
        panel.setLayout(null);
        marco.setLocationRelativeTo(marco); 
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        marco.setVisible(true);  
    }
    
    public void interfaz(){
        this.compoñentes();

        boton1.setBounds(100, 500, 150, 40);
        boton2.setBounds(350, 500, 150, 40);
        areaTexto.setBounds(100, 300, 400, 150);
        etiqueta1.setBounds(100, 25, 100, 100);
        etiqueta2.setBounds(100, 125, 100, 100);
        liñaTexto1.setBounds(200, 50, 300, 50);
        liñaTexto2.setBounds(200, 150, 300, 50);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(areaTexto);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        panel.add(liñaTexto1);
        panel.add(liñaTexto2);
        marco.add(panel);
        this.pecharVentana();
        
        boton1.addActionListener(this);
        boton2.addActionListener(this);
    }
    
        @Override
    public void actionPerformed(ActionEvent e) {
        Object ob = e.getSource();
        if (ob==boton1)
            areaTexto.setText("Hola " + liñaTexto1.getText());
        else
            areaTexto.setText(" ");
            }
}

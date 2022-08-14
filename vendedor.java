/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servicioventas;

/**
 *
 * @author emilia
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class vendedor extends JFrame {

    JTabbedPane pestañas = new JTabbedPane();

    public void inicio() {

        setTitle("Ventas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(50, 175, 900, 800);
        setVisible(true);

        Nueva_venta nv = new Nueva_venta();
        nv.ejecutar();

        ventas_realizadas vr = new ventas_realizadas();

        pestañas.addTab("Nueva venta", nv.general);
        pestañas.addTab("Productos", vr.ventas_general);
        add(pestañas);

    }

  
}
 
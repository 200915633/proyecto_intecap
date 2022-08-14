/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servicioventas;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author emilia
 */
public class Administrador extends JFrame{
    
         JTabbedPane pestañas = new JTabbedPane();
    
    JPanel vendedores = new JPanel();
    JPanel clientes = new JPanel();
    JPanel productos = new JPanel();

    private void inicio() {
        setTitle("Administrador");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(50, 175, 900, 800);
        setVisible(true);

        
        productos.setLayout(null);
        clientes.setLayout(null);
        vendedores.setLayout(null);
        
        
        sucursales_vistas sv = new sucursales_vistas();
        sv.ejecutar();
       
        producto_vistas pv= new producto_vistas();
        pv.ejecutar();
        
        cliente_vista cl = new cliente_vista();
        cl.ejecutar();
        
        vendedor_vista vv =new vendedor_vista();
        vv.ejecutar();
        pestañas.addTab("Sucursales", sv.sucursales);
        pestañas.addTab("Productos", pv.productos);
        pestañas.addTab("Clientes", cl.clientes);
        pestañas.addTab("Vendedores", vv.vendedor);
        
        add(pestañas);
        

    }

    public void ejecutar() {

        inicio();
    }

   
    
}

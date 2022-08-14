/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servicioventas;

/**
 *
 * @author emilia
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductosDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    Object resultado [] = new Object[3];

    public Object[] filtro(int codigo) {

        String sql = "select * from productos where codigo = " + "'" + codigo + "'" + ";";
        try {
            con = conectar.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                resultado[0] = rs.getInt(1);
                resultado[1] = rs.getString(2);
                resultado[2] = rs.getDouble(5);
                
                return resultado;
            }

        } catch (Exception e) {

        }

        return null;
    }
    
    

}
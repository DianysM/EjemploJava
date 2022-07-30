/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itq.datos;

import java.sql.Connection;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * 
 */
public class InicializadorDatos {
    
    private ConexionBdd conexion;
    
     public void inicializarBdd(){
        conexion = new ConexionBdd();
        crearTablaCliente();
        crearTablaProducto();
    }
    
    private void crearTablaCliente(){
        Connection conn = conexion.obtener();
      try {        
         Statement stmt = conn.createStatement();
         String sql = getCrearTablaClienteSql();
         stmt.executeUpdate(sql);
         conn.close();
      }  catch (Exception ex) {
          Logger.getLogger(ConexionBdd.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
     private void crearTablaProducto(){
        Connection conn = conexion.obtener();
        try {        
         Statement stmt = conn.createStatement();
         String sql = getCrearTablaProductoSql();
         stmt.executeUpdate(sql);
         conn.close();
      }  catch (Exception ex) {
          Logger.getLogger(ConexionBdd.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
    private String getCrearTablaClienteSql(){
        return " CREATE TABLE IF NOT EXISTS cliente("
                + "cedula VARCHAR(10) NOT NULL,"
                + " nombre VARCHAR(100) NOT NULL,"
                + " apellido VARCHAR(100) NOT NULL,"
                + " direccion VARCHAR(200) NOT NULL);";
    }
    
     private String getCrearTablaProductoSql(){
        return " CREATE TABLE IF NOT EXISTS producto("
                + "codigo_barras VARCHAR(20) NOT NULL,"
                + " nombre VARCHAR(100) NOT NULL,"
                + " precio DECIMAL(10,2) NOT NULL);";
    }
}

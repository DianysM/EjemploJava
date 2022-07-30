/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itq.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * 
 */
public class ConexionBdd {
    
   public Connection obtener(){
       Connection conexion = null;
       try {
           conexion =
                   DriverManager.getConnection("jdbc:hsqldb:file:C:/fact_db/factdb",
                           "sa", "");
       } catch (SQLException ex) {
           Logger.getLogger(ConexionBdd.class.getName()).log(Level.SEVERE, null, ex);
       }
       return conexion;
   }
   
}

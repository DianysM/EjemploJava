/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itq.datos;

import com.itq.modelo.ProductoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * 
 */
public class ProductoDao {
    public  List<ProductoModel> listarTodos()
   {
       List<ProductoModel> productos = new ArrayList<>();
       String sql = "SELECT codigo_barras,nombre,precio FROM producto";
       ConexionBdd conexion = new ConexionBdd();
       Connection conn = conexion.obtener();
        try {        
         PreparedStatement preparedStatement = conn.prepareStatement(sql);
         ResultSet rs = preparedStatement.executeQuery();
         
       
            while (rs.next()) {
                String rCodigoBarras = rs.getString(1);
                String rNombre = rs.getString(2);
                double rPrecio = rs.getDouble(3);
                ProductoModel producto = new ProductoModel();
                producto.setCodigoBarras(rCodigoBarras);
                producto.setNombre(rNombre);
                producto.setPrecio(rPrecio);
                productos.add(producto);
            }
            
         conn.close();
      }  catch (Exception ex) {
          Logger.getLogger(ConexionBdd.class.getName()).log(Level.SEVERE, null, ex);
      }
       
       return productos;
   }
   
   public  List<ProductoModel> buscar(String codigoBarras)
   {
       List<ProductoModel> productos = new ArrayList<>();
       String sql = "SELECT codigo_barras,nombre,precio FROM producto WHERE codigo_barras like ?";
       ConexionBdd conexion = new ConexionBdd();
       Connection conn = conexion.obtener();
        try {        
         PreparedStatement preparedStatement = conn.prepareStatement(sql);
         String likeCodigoBarras = codigoBarras+"%";
         preparedStatement.setString(1, likeCodigoBarras);
         ResultSet rs = preparedStatement.executeQuery();
       
            while (rs.next()) {
                String rCodigoBarras = rs.getString(1);
                String rNombre = rs.getString(2);
                double rPrecio = rs.getDouble(3);
                ProductoModel producto = new ProductoModel();
                producto.setCodigoBarras(rCodigoBarras);
                producto.setNombre(rNombre);
                producto.setPrecio(rPrecio);
                productos.add(producto);
            }
            
         conn.close();
      }  catch (Exception ex) {
          Logger.getLogger(ConexionBdd.class.getName()).log(Level.SEVERE, null, ex);
      }
       
       return productos;
   }
   
   public void agregar(ProductoModel producto)
   {
       String sql = "INSERT INTO producto(codigo_barras,nombre,precio)"
               +"values(?,?,?)";
       ConexionBdd conexion = new ConexionBdd();
       Connection conn = conexion.obtener();
        try {        
         PreparedStatement preparedStatement = conn.prepareStatement(sql);
         preparedStatement.setString(1, producto.getCodigoBarras());
         preparedStatement.setString(2, producto.getNombre());
         preparedStatement.setDouble(3, producto.getPrecio());
         preparedStatement.executeUpdate();
         conn.close();
      }  catch (Exception ex) {
          Logger.getLogger(ConexionBdd.class.getName()).log(Level.SEVERE, null, ex);
      }
   }
   
   public void actualizar(ProductoModel producto)
   {
       String sql = "UPDATE producto SET nombre = ?,precio = ?"
               +" WHERE codigo_barras = ?";
       ConexionBdd conexion = new ConexionBdd();
       Connection conn = conexion.obtener();
        try {        
         PreparedStatement preparedStatement = conn.prepareStatement(sql);
         preparedStatement.setString(1, producto.getNombre());
         preparedStatement.setDouble(2, producto.getPrecio());
         preparedStatement.setString(3, producto.getCodigoBarras());
         preparedStatement.executeUpdate();
         conn.close();
      }  catch (Exception ex) {
          Logger.getLogger(ConexionBdd.class.getName()).log(Level.SEVERE, null, ex);
      }
   }
   
   public void eliminar(ProductoModel producto)
   {
       String sql = "DELETE FROM producto"
               +" WHERE codigo_barras = ?";
       ConexionBdd conexion = new ConexionBdd();
       Connection conn = conexion.obtener();
        try {        
         PreparedStatement preparedStatement = conn.prepareStatement(sql);
         preparedStatement.setString(1, producto.getCodigoBarras());
         preparedStatement.executeUpdate();
         conn.close();
      }  catch (Exception ex) {
          Logger.getLogger(ConexionBdd.class.getName()).log(Level.SEVERE, null, ex);
      }
   }
}

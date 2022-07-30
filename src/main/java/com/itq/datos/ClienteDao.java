/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itq.datos;
import com.itq.modelo.ClienteModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * 
 */
public class ClienteDao {
    
    public  List<ClienteModel> listarTodos()
   {
       List<ClienteModel> clientes = new ArrayList<>();
       String sql = "SELECT cedula,nombre,apellido,direccion FROM cliente";
       ConexionBdd conexion = new ConexionBdd();
       Connection conn = conexion.obtener();
        try {
         PreparedStatement preparedStatement = conn.prepareStatement(sql);
         ResultSet rs = preparedStatement.executeQuery();
       
            while (rs.next()) {
                String rCedula = rs.getString(1);
                String rNombre = rs.getString(2);
                String rApellido = rs.getString(3);
                String rDireccion = rs.getString(4);
                ClienteModel cliente = new ClienteModel();
                cliente.setCedula(rCedula);
                cliente.setNombre(rNombre);
                cliente.setApellido(rApellido);
                cliente.setDireccion(rDireccion);
                clientes.add(cliente);
            }
            
         conn.close();
      }  catch (Exception ex) {
          Logger.getLogger(ConexionBdd.class.getName()).log(Level.SEVERE, null, ex);
      }
       
       return clientes;
   }
   
   public  List<ClienteModel> buscar(String cedula)
   {
       List<ClienteModel> clientes = new ArrayList<>();
       String sql = "SELECT cedula,nombre,apellido,direccion FROM cliente WHERE cedula like ?";
       ConexionBdd conexion = new ConexionBdd();
       Connection conn = conexion.obtener();
        try {        
         PreparedStatement preparedStatement = conn.prepareStatement(sql);
         String likeCedula = cedula+"%";
         preparedStatement.setString(1, likeCedula);
         ResultSet rs = preparedStatement.executeQuery();
       
            while (rs.next()) {
                String rCedula = rs.getString(1);
                String rNombre = rs.getString(2);
                String rApellido = rs.getString(3);
                String rDireccion = rs.getString(4);
                ClienteModel cliente = new ClienteModel();
                cliente.setCedula(rCedula);
                cliente.setNombre(rNombre);
                cliente.setApellido(rApellido);
                cliente.setDireccion(rDireccion);
                clientes.add(cliente);
            }
            
         conn.close();
      }  catch (Exception ex) {
          Logger.getLogger(ConexionBdd.class.getName()).log(Level.SEVERE, null, ex);
      }
       
       return clientes;
   }
   
   public void agregar(ClienteModel cliente)
   {
       String sql = "INSERT INTO cliente(cedula,nombre,apellido,direccion)"
               +"values(?,?,?,?)";
       ConexionBdd conexion = new ConexionBdd();
       Connection conn = conexion.obtener();
        try {        
         PreparedStatement preparedStatement = conn.prepareStatement(sql);
         preparedStatement.setString(1, cliente.getCedula());
         preparedStatement.setString(2, cliente.getNombre());
         preparedStatement.setString(3, cliente.getApellido());
         preparedStatement.setString(4, cliente.getDireccion());
         preparedStatement.execute();
         conn.close();
      }  catch (Exception ex) {
          Logger.getLogger(ConexionBdd.class.getName()).log(Level.SEVERE, null, ex);
      }
   }
   
   public void actualizar(ClienteModel cliente)
   {
       String sql = "UPDATE cliente SET nombre = ?,apellido = ?,direccion = ?"
               +" WHERE cedula = ?";
       ConexionBdd conexion = new ConexionBdd();
       Connection conn = conexion.obtener();
        try {        
         PreparedStatement preparedStatement = conn.prepareStatement(sql);
         preparedStatement.setString(1, cliente.getNombre());
         preparedStatement.setString(2, cliente.getApellido());
         preparedStatement.setString(3, cliente.getDireccion());
         preparedStatement.setString(4, cliente.getCedula());
         preparedStatement.executeUpdate();
         conn.close();
      }  catch (Exception ex) {
          Logger.getLogger(ConexionBdd.class.getName()).log(Level.SEVERE, null, ex);
      }
   }
   
   public void eliminar(ClienteModel cliente)
   {
       String sql = "DELETE FROM cliente"
               +" WHERE cedula = ?";
       ConexionBdd conexion = new ConexionBdd();
       Connection conn = conexion.obtener();
        try {        
         PreparedStatement preparedStatement = conn.prepareStatement(sql);
         preparedStatement.setString(1, cliente.getCedula());
         preparedStatement.executeUpdate();
         conn.close();
      }  catch (Exception ex) {
          Logger.getLogger(ConexionBdd.class.getName()).log(Level.SEVERE, null, ex);
      }
   }
   
}

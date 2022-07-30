/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itq.modelo;

/**
 *
 * 
 */
public class ProductoCantidadModel extends ProductoModel {
    
    private int cantidad;
    
    public ProductoCantidadModel( String codigoBarras,String nombre,int cantidad,double precio){
        this.setCodigoBarras(codigoBarras);
        this.setNombre(nombre);
        this.cantidad = cantidad;
        this.setPrecio(precio);
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.itq.facturacion;

import com.itq.datos.InicializadorDatos;
import com.itq.formularios.JfrPrincipal;

/**
 *
 * 
 */
public class Facturacion {
    private static InicializadorDatos inicializadorDatos;
    private static JfrPrincipal formularioPrincipal;
    
    public static void main(String[] args) {
        inicializadorDatos = new InicializadorDatos();
        inicializadorDatos.inicializarBdd();
        formularioPrincipal = new JfrPrincipal();
        formularioPrincipal.setVisible(true);
    }
}

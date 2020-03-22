package com.almacenmuchascosas.factura;

import com.almacenmuchascosas.articulo.Articulo;
import java.time.LocalDate;

/**
 *
 * @author angelrg
 */
public class Factura {

    int codigo;
    LocalDate fecha;
    Articulo[] transacciones;
    double total;
    
    public void printArticulos(){
       for (int i = 0; i < transacciones.length; i++) {
            transacciones[i].printMe();
        } 
    }
}

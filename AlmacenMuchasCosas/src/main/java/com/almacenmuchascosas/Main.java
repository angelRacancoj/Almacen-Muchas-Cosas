package com.almacenmuchascosas;

/**
 *
 * @author angelrg
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Almacen almacen = new Almacen();
        almacen.inicio();
        almacen.inicioProveedores();
        almacen.inicioArticulos();
        System.out.println();
        almacen.obtenerCliente("11");
        almacen.obtenerCliente("4");
        almacen.obtenerProveedor("1");
        almacen.obtenerArticulo(107);
 
    }

}

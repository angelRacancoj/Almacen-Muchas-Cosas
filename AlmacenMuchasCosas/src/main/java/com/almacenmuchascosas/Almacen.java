package com.almacenmuchascosas;

import com.almacenmuchascosas.articulo.Articulo;
import com.almacenmuchascosas.entidades.Cliente;
import com.almacenmuchascosas.manejadores.ManejadorArticulos;
import com.almacenmuchascosas.manejadores.ManejadorClientes;

/**
 *
 * @author angelrg
 */
public class Almacen {
    
    ManejadorClientes clientesM = new ManejadorClientes();
    
    Cliente[] clientes;
    
    ManejadorArticulos articulosM = new ManejadorArticulos();
    
     Articulo[] articulos;
     
    
    public void inicio() {
        clientes = clientesM.crearDatos();
        clientesM.printClientes(clientes);
        articulos = articulosM.crearArticulos();
        articulosM.printArticulos(articulos);
    }
    
    
}

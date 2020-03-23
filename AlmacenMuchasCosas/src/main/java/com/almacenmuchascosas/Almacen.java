package com.almacenmuchascosas;

import com.almacenmuchascosas.articulo.Articulo;
import com.almacenmuchascosas.entidades.Cliente;
import com.almacenmuchascosas.entidades.Proveedor;
import com.almacenmuchascosas.manejadores.ManejadorArticulos;
import com.almacenmuchascosas.manejadores.ManejadorClientes;
import com.almacenmuchascosas.manejadores.ManejadorProveedores;

/**
 *
 * @author angelrg
 */
public class Almacen {
    
    ManejadorClientes clientesM = new ManejadorClientes();    
    Cliente[] clientes;
    
    ManejadorProveedores proveedoresM= new ManejadorProveedores();     
    Proveedor[] proveedores;
    
    ManejadorArticulos articulosM = new ManejadorArticulos();
    Articulo[] articulos;
    
    
    public void inicio() {
        // Se crea una lista con Clientes y se imprime
        clientes = clientesM.crearDatos();
        clientesM.printClientes(clientes);
        
        
        // Se crea una lista con Proveedores y se imprime
        System.out.println("");
        proveedores = proveedoresM.crearDatos();
        proveedoresM.printProveedores(proveedores);
        
        
        // Se busca un proveedor con NIT 991 y se imprime
        System.out.println("");
        Proveedor proveedorBuscado = proveedoresM.buscarProveedor(proveedores, "991");        
        proveedorBuscado.printMe();
        
        
        //Se crea una lista con Articulos y se imprime
        System.out.println("");
        articulos = articulosM.crearDatos();
        articulosM.printArticulos(articulos);
        
        
        //Se busca un Articulo con Codigo 117 y se imprime
        System.out.println("");
        Articulo articuloBuscado = articulosM.buscarArticulo(articulos, 117);
        articuloBuscado.printMe();
        
    }
    
    
}

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
    
       
    ManejadorClientes clientesM= new ManejadorClientes();
    ManejadorProveedores proveedoresM= new ManejadorProveedores();
    ManejadorArticulos articulosM= new ManejadorArticulos();
    
    Cliente[] clientes;
    Proveedor[] proveedores;
    Articulo[] articulos;
 
    
    public void inicioClientes(){
        clientes = clientesM.crearDatos();
        clientesM.printClientes(clientes);
        System.out.println("");
    }
    
    public void inicioProveedores(){
        proveedores = proveedoresM.crearDatos();
        proveedoresM.printProveedores(proveedores);
        System.out.println("");
    }
    
    public void inicioArticulos(){
        articulos = articulosM.crearDatos();
        articulosM.printArticulo(articulos);
        System.out.println("");
    }
       
}

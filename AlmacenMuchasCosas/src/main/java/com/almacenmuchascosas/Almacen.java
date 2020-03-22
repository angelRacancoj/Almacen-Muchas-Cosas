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
    ManejadorArticulos articulosSH = new ManejadorArticulos();
    ManejadorProveedores proveedoresSH = new ManejadorProveedores();
    
    
    Cliente[] clientes;
    Articulo[] articulos;
    Proveedor[] proveedores;
    public void inicio() {
        clientes = clientesM.crearDatos();
        clientesM.printClientes(clientes);
        articulos = articulosSH.crearDatos();
        articulosSH.mostrarArticulos(articulos);
        proveedores= proveedoresSH.crearDatos();
        proveedoresSH.mostrarProveedores(proveedores);
    }
    
}

package com.almacenmuchascosas;

import com.almacenmuchascosas.entidades.Cliente;
import com.almacenmuchascosas.manejadores.ManejadorClientes;
import com.almacenmuchascosas.entidades.Proveedor;
import com.almacenmuchascosas.manejadores.ManejadorProveedores;
import com.almacenmuchascosas.articulo.Articulo;
import com.almacenmuchascosas.manejadores.ManejadorArticulos;
/**
 *
 * @author angelrg
 */
public class Almacen {
    
    ManejadorClientes clientesM = new ManejadorClientes();
    ManejadorProveedores ProveedoresM = new ManejadorProveedores();
    ManejadorArticulos ArticulosM = new ManejadorArticulos();
    
    Cliente[] clientes;
    Proveedor[] proveedores;
    Articulo[] articulos;
    
    public void inicio() {
        clientes = clientesM.crearDatos();
        clientesM.printClientes(clientes);
        proveedores = ProveedoresM.crearDatos();
        ProveedoresM.printProveedor(proveedores);
        articulos = ArticulosM.crearDatos();
        ArticulosM.printArticulo(articulos);
        
    }
}

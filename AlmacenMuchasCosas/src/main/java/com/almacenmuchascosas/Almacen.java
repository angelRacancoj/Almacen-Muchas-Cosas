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
    ManejadorProveedores proveedoresM = new ManejadorProveedores();
    ManejadorArticulos articulosM = new ManejadorArticulos();
    
    Cliente[] clientes;
    Proveedor[] proveedores;
    Articulo[] articulos;
    
    public void inicio() {
        clientes = clientesM.crearDatos();
        clientesM.printClientes(clientes);
    }
    
    public void inicioProveedores(){
        proveedores = proveedoresM.crearProveedores();
        proveedoresM.printProveedores(proveedores);
    }
    
    public void inicioArticulos(){
        articulos = articulosM.crearArticulos();
        articulosM.printArticulos(articulos);
    }
    
    //Sirven para realizar la busqueda del cliente o proveedor mediante su número de NIT
    public void obtenerCliente(String NIT){
        clientesM.buscarCliente(clientes, NIT);
    }
    
    public void obtenerProveedor(String NIT){
        proveedoresM.buscarProveedor(proveedores, NIT);
    }
    //Busca el articulo segun su codigo 
    public void obtenerArticulo(int codigo){
        articulosM.buscarArticulo(articulos, codigo);
    }
    public void retornarArticulo(int codigo){
        articulosM.devolverArticulo(articulos, codigo);
    }
    public void retornarCliente(String NIT){
        clientesM.devolverCliente(clientes, NIT);
    }
    //Fin busquedas
    
}

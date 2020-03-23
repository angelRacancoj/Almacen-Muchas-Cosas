package com.almacenmuchascosas;

import com.almacenmuchascosas.articulo.Articulo;
import com.almacenmuchascosas.entidades.Cliente;
import com.almacenmuchascosas.entidades.Proveedor;
import com.almacenmuchascosas.manejadores.ManejadorArticulos;
import com.almacenmuchascosas.manejadores.ManejadorClientes;
import com.almacenmuchascosas.manejadores.ManejadorProveedores;


public class Almacen {
    
    ManejadorClientes clientesM = new ManejadorClientes();
    ManejadorProveedores proveedoresM = new ManejadorProveedores(); 
    ManejadorArticulos manejarArticulosM = new ManejadorArticulos(); 
    
    
    
    
    
    Cliente[] clientes;
    Articulo [] articulos;
    Proveedor [] proveedor; 
   
    public void inicio() {
      
        System.out.println("Datos de los clientes");
        clientes = clientesM.crearDatos();
        clientesM.printClientes(clientes);
      
        
     
        
        
        
        System.out.println("\n");
        System.out.println(" Datos de los Proveedores");
        
        proveedor = proveedoresM.generarDatosProveedores();
        proveedoresM.printClientes(proveedor);

        
       
        
        System.out.println("\n");
        System.out.println("Datos de los articulos");
   
        articulos =manejarArticulosM.generarDatosArticulos(); 
        manejarArticulosM.printClientes(articulos);
         manejarArticulosM.buscarArticuloCodigo(50, articulos);
         
         
          
        
        
        
        
        
      
       
        
    
    
    }
    
}

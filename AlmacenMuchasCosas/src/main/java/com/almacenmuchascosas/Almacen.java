package com.almacenmuchascosas;

import com.almacenmuchascosas.articulo.Articulo;
import com.almacenmuchascosas.articulo.Transaccion;
import com.almacenmuchascosas.entidades.Cliente;
import com.almacenmuchascosas.entidades.Proveedor;
import com.almacenmuchascosas.factura.FacturaProveedor;
import com.almacenmuchascosas.manejadores.ManejadorArticulos;
import com.almacenmuchascosas.manejadores.ManejadorClientes;
import com.almacenmuchascosas.manejadores.ManejadorProveedores;
import java.time.LocalDate;

/**
 *
 * @author angelrg
 */
public class Almacen {
    
    ManejadorClientes clientesM = new ManejadorClientes();
    ManejadorArticulos articles = new ManejadorArticulos();
    ManejadorProveedores providers= new ManejadorProveedores();
    LocalDate fecha = null;
    Proveedor[] proveedor;
    Proveedor proveedorAux;
    Articulo[] articulosAlmacenados;
    Articulo[] articuloAux;
    Articulo[] articuloProveedor;
    Cliente[] clientes;
    
    public void inicio() {
        clientes = clientesM.crearDatos();
        clientesM.printClientes(clientes);
        System.out.println("\n\n\n Probamos la creacion un almacen \n\n");
        articulosAlmacenados = articles.crearDatos();
        for (Articulo articulo1 : articulosAlmacenados) {
            System.out.println(articulo1.getNombre());
        }
        System.out.println("Probando metodo obtener lista de articulos");
        articuloAux = articles.getArticles(articulosAlmacenados);
        for (int i=0; i<articuloAux.length;i++){
            System.out.println( (i+1) +".- Nombre: "+ articuloAux[i].getNombre()+" Codigo: "+articuloAux[i].getCodigo());
        }
        System.out.println("Obtenemos un articulo buscando por el codigo 123");
        System.out.println(articles.lookArticle(articuloAux, 123).getNombre());
        System.out.println("Fin Prueba manejador Articulos\n\n\n");
        
        System.out.println("Inicio Prueba manejador proveedores");
        //Creamos datos de un arreglo proveedor usando el manejadorproveedores
        proveedor = providers.crearDatos();
        
        //Creamos facturas, utilizando los articulos usados antes y una lista de proveedores por un metodo de manejador de proveedores
        Transaccion[] transaccion = new Transaccion[2];
        transaccion[0] = new Transaccion(articuloAux[0],20,30);
        transaccion[1] = new Transaccion(articuloAux[1],15,70);
        FacturaProveedor[] facturas = new FacturaProveedor[3];
        facturas[0] = new FacturaProveedor(proveedor[0],transaccion, 123 ,null, 700 ); 
        facturas[1] = new FacturaProveedor(proveedor[1],transaccion, 222 ,null, 900 ); 
        facturas[2] = new FacturaProveedor(proveedor[2],transaccion, 333 ,null, 1000 );
        
        for (int i=0; i<proveedor.length;i++){
            System.out.println( (i+1) +".- Nombre:"+ proveedor[i].getNombre()+" NIT: "+proveedor[i].getNIT());
        }
        System.out.println("\n\n Ahora probamos buscando al proveedor dado un NIT que sera el de 3");
        proveedorAux =providers.findProvider(proveedor, "3");
        System.out.println("Nombre: " +proveedorAux.getNombre()+" NIT: "+proveedorAux.getNIT());
        System.out.println("Ahora tratamos de encontrar articulos de un proveedor en base a las facturas y dando su NIT");
       

 
        System.out.println("1");
        articuloProveedor = providers.getArticlesArr(facturas, "1", facturas[0]);
    
        for (int i=0; i<articuloProveedor.length;i++){
            System.out.println( (i+1) +".- Nombre: "+ articuloProveedor[i].getNombre()+" Codigo: "+articuloProveedor[i].getCodigo());
        }
       
        
    }
    
}

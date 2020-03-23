package com.almacenmuchascosas;

import com.almacenmuchascosas.articulo.Articulo;
import com.almacenmuchascosas.entidades.Cliente;
import com.almacenmuchascosas.manejadores.ManejadorClientes;
import com.almacenmuchascosas.manejadores.ManejadorArticulos;

/**
 *
 * @author angelrg
 */
public class Almacen {
    
    ManejadorClientes clientesM = new ManejadorClientes();

    Cliente[] clientes;

    public void inicio() {
        clientes = clientesM.crearDatos();
        clientesM.printClientes(clientes);
    }

}

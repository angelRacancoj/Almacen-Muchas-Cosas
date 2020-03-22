package com.almacenmuchascosas.factura;

import com.almacenmuchascosas.articulo.Articulo;
import com.almacenmuchascosas.entidades.Proveedor;

/**
 *
 * @author angelrg
 */
public class FacturaProveedor extends Factura {
    Proveedor proveedor;
    Articulo[] articulosTransferidos;
    public Proveedor getProveedor(){ 
        return proveedor;
    }
    public void mostrarArticulos(){
     for (int i = 0; i < articulosTransferidos.length; i++) {
            articulosTransferidos[i].printMe();
        } 
    }
}

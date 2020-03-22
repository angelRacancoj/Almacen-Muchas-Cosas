/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacenmuchascosas.manejadores;

import com.almacenmuchascosas.entidades.Proveedor;
import com.almacenmuchascosas.factura.Factura;

/**
 *
 * @author chejohrpp
 */
class facturaProveedor extends Factura{
    Proveedor proveedor;
    public Proveedor getProveedor(){ 
        return proveedor;
    }
    public void mostrarArticulos(){
     for (int i = 0; i < articulosTransferidos.length; i++) {
            articulosTransferidos[i].printMe();
        } 
    }
}

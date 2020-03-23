package com.almacenmuchascosas.factura;

import com.almacenmuchascosas.articulo.Transaccion;
import com.almacenmuchascosas.entidades.Proveedor;
import java.time.LocalDate;

/**
 *
 * @author angelrg
 */
public class FacturaProveedor extends Factura {

    Proveedor proveedor;

    public FacturaProveedor(Proveedor proveedor,Transaccion[] transaction, int codigo, LocalDate fecha, double total) {
        super(transaction, codigo, fecha, total);
        this.proveedor = proveedor;
    }
    
    public Proveedor getProvider(){
       return this.proveedor;
    }

   

 
}

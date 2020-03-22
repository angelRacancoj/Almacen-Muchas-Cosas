package com.almacenmuchascosas.factura;

import com.almacenmuchascosas.entidades.Proveedor;
import java.time.LocalDate;

/**
 *
 * @author angelrg
 */
public class FacturaProveedor extends Factura{

    Proveedor proveedor;
    
    public FacturaProveedor(int codigo, LocalDate fecha, double total, Proveedor proveedor) {
        super(codigo, fecha, total);
        this.proveedor = proveedor;
    }
    
    
    
   
}

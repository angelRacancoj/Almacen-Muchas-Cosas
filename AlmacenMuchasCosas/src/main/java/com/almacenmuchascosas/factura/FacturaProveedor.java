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

    public FacturaProveedor(Proveedor proveedor, int codigo, LocalDate fecha, double total) {
        super(codigo, fecha, total);
        this.proveedor = proveedor;
    }

    public FacturaProveedor(Proveedor proveedor, int codigo, LocalDate fecha, Transaccion[] transacciones, double total) {
        super(codigo, fecha, transacciones, total);
        this.proveedor = proveedor;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

}

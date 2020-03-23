package com.almacenmuchascosas.factura;

import com.almacenmuchascosas.articulo.Transaccion;
import com.almacenmuchascosas.entidades.Cliente;
import java.time.LocalDate;

/**
 *
 * @author angelrg
 */
public class FacturaCliente extends Factura{
    
    Cliente cliente;

    public FacturaCliente(Transaccion[] transaction, int codigo, LocalDate fecha, double total) {
        super(transaction, codigo, fecha, total);
    }
}

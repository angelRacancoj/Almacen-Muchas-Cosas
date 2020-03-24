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

    public FacturaCliente(Cliente cliente, int codigo, LocalDate fecha, double total) {
        super(codigo, fecha, total);
        this.cliente = cliente;
    }

    public FacturaCliente(Cliente cliente, int codigo, LocalDate fecha, Transaccion[] transacciones, double total) {
        super(codigo, fecha, transacciones, total);
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
}

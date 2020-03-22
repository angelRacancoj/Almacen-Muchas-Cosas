package com.almacenmuchascosas.factura;

import com.almacenmuchascosas.entidades.Cliente;
import java.time.LocalDate;

/**
 *
 * @author angelrg
 */
public class FacturaCliente extends Factura{
    
    Cliente cliente;
    

    public FacturaCliente(int codigo, LocalDate fecha, double total, Cliente cliente) {
        super(codigo, fecha, total);
        this.cliente = cliente;
     
    }


    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
 
}

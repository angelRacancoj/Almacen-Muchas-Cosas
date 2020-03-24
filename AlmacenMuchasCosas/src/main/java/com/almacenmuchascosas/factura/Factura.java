package com.almacenmuchascosas.factura;

import com.almacenmuchascosas.articulo.Transaccion;
import java.time.LocalDate;

/**
 *
 * @author angelrg
 */
public class Factura {

    int codigo;
    LocalDate fecha;
    Transaccion[] transacciones;
    double total;

    public Factura(int codigo, LocalDate fecha, double total) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.total = total;
    }

    public Factura(int codigo, LocalDate fecha, Transaccion[] transacciones, double total) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.transacciones = transacciones;
        this.total = total;
    }

    public int getCodigo() {
        return codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Transaccion[] getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(Transaccion[] transacciones) {
        this.transacciones = transacciones;
    }

    public double getTotal() {
        return total;
    }

}

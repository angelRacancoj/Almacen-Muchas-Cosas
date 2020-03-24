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
        this.transacciones = new Transaccion[10];
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

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Transaccion[] getTransacciones() {
        return transacciones;
    }

    public void addTransaccion(Transaccion newTransaccion) {
        for (Transaccion transaccion : transacciones) {
            if (transaccion == null) {
                transaccion = newTransaccion;
                break;
            }
        }
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}

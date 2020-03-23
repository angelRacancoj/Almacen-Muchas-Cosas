package com.almacenmuchascosas.factura;

import java.time.LocalDate;

/**
 *
 * @author angelrg
 */
public class Factura {

    int codigo;
    LocalDate fecha;

    double total;

    public Factura() {

    }

    public Factura(int codigo, LocalDate fecha, double total) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.total = total;

    }

}

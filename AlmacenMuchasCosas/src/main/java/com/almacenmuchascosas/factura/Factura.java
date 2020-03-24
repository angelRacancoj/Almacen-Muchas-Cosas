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
    

}

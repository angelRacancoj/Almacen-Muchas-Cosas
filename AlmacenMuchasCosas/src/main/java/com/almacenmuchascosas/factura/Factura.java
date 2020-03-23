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
    double total;
    Transaccion[] transaction;
    
    public Factura(Transaccion[] transaction,int codigo,LocalDate fecha,double total ){
        this.transaction = transaction;
        this.codigo = codigo;
        this.fecha = fecha;
        this.total = total;
    }
    /**
     * Obtener el codigo de la factura
     * @return 
     */
    public int getCode(){
        return this.codigo;
    }
    
    /**
     * Obtener transacciones de una factura
     * @return 
     */
    public Transaccion[] getTransactions(){
        return this.transaction;
    }
    
}

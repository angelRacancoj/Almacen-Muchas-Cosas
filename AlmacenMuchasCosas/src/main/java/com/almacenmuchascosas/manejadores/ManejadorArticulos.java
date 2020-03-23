package com.almacenmuchascosas.manejadores;

import com.almacenmuchascosas.entidades.Cliente;
import com.almacenmuchascosas.articulo.Articulo;

/**
 *
 * @author angelrg, AbnHL-24
 */
public class ManejadorArticulos {

    /**
     * Por simplicidad y cierto patron pArticulo[] articulosara programar se usa la misma logica en
     * buscarArticuloPorCodigo que en ManejadorClentes.buscarClientePorNit,
     * pues asumo que los articulos tambien se manejaran mediante un array.
     *
     * @param articulos
     * @param codigo
     * @return
     */
    public Articulo buscarArticuloPorCodigo(Articulo[] articulos, int codigo){
        for (Articulo articulo : articulos) {
            if (articulo.getCodigo() == codigo) {
                return articulo;
            }
        }
        return null;
    }

    /**
     * Aca se recibe el objeto articulos, el codigo del articulo que se quiere obtener
     * para la compra, se le resta la cantidad deseada y se setea la nueva existencia.
     * @param articulos
     * @param codigo
     * @param existencia
     */
    public void obtenerArticulo(Articulo articulos, int codigo, double existencia, int cantidad){
            if(existencia > 0){
                double existenciaRestante = existencia - cantidad;
             articulos.setExistencia(existenciaRestante);
            }
        }

    }

}

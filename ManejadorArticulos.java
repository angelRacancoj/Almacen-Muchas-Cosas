package com.almacenmuchascosas.manejadores;

import com.almacenmuchascosas.articulo.Articulo;

/**
 *
 * @author luisbs
 */
public class ManejadorArticulos {

    public Articulo[] articulosExistentes() {
        Articulo[] nuevoArticulo = new Articulo[11];
        //codigo, nombre del artículo, existencia y precio
        nuevoArticulo[0] = new Articulo(2, "Martillo", 4, 15);
        nuevoArticulo[1] = new Articulo(3, "Clavos(LIBRAS)", 12, 10);
        nuevoArticulo[3] = new Articulo(4, "Pala", 2, 25);
        nuevoArticulo[4] = new Articulo(165, "Azadón", 7, 25);
        nuevoArticulo[5] = new Articulo(12, "Escobas", 12, 18);
        nuevoArticulo[6] = new Articulo(22, "Duchas", 4, 15);
        nuevoArticulo[7] = new Articulo(14, "Limpia vidrios", 4, 15);
        nuevoArticulo[8] = new Articulo(16, "Toallas", 4, 15);
        nuevoArticulo[9] = new Articulo(20, "Librera", 4, 15);
        nuevoArticulo[10] = new Articulo(150, "Papel aluminio ", 25, 55);

        return nuevoArticulo;
    }

    public Articulo buscandoArticulo(Articulo[] nuevoArticulo, int codigoArticulo) {
        //forma mejorada
        for (Articulo articulo : nuevoArticulo) {
            if (articulo.getCodigo() == codigoArticulo) {
                return articulo;
            }
        }
        /*Articulo articuloBuscado = null;
        for (int i = 0; i < nuevoArticulo.length; i++) {
            if(articuloBuscado.getCodigo() == codigoArticulo  )
                return articuloBuscado;
        }*/
        System.out.println("Articulo No encontrado, o se han agotado la existencias");
        return null;
    }

}

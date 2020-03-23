package com.almacenmuchascosas.manejadores;

import com.almacenmuchascosas.articulo.Articulo;

/**
 *
 * @author angelrg
 */
public class ManejadorArticulos {

    public Articulo[] crearArticulos() {
        Articulo[] articulos = new Articulo[3];
        articulos[0] = new Articulo(001, "producotoCero", 10, 20.00);
        articulos[1] = new Articulo(002, "producotoUno", 10, 20.00);
        articulos[2] = new Articulo(003, "producotoDos", 10, 20.00);
        articulos[3] = new Articulo(004, "producotoTres", 10, 20.00);
        return articulos;

    }

    /**
     * Este metodo realiza la busqueda mediante el codigo del articulo
     *
     * @param articulos
     * @param codigo
     * @return
     */
    public Articulo buscarArticulo(Articulo[] articulos, int codigo) {
        for (Articulo articulo : articulos) {
            if (articulo.getCodigo() == codigo) {
                return articulo;
            }
        }
        return null;
    }

    public void printArticulos(Articulo[] articulos) {
        for (int i = 0; i < articulos.length; i++) {
            articulos[i].printMeArt();
        }
    }
}

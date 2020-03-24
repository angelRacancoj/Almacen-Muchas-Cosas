package com.almacenmuchascosas.manejadores;

import com.almacenmuchascosas.articulo.Articulo;

/**
 *
 * @author angelrg
 */
public class ManejadorArticulos {

    /**
     * Este netodo se encarga de generar datos iniciales para nuestro sistema
     *
     * @return
     */
    public Articulo[] crearDatos() {
        Articulo[] articulos = new Articulo[10];
        articulos[0] = new Articulo(110, "Leche", 40, 10.5);
        articulos[1] = new Articulo(111, "Harina", 50, 11.4);
        articulos[2] = new Articulo(112, "Cafe", 9, 12.8);
        articulos[3] = new Articulo(113, "Coca-Cola", 45, 13.7);
        articulos[4] = new Articulo(114, "Garrafon", 54, 14.3);
        articulos[5] = new Articulo(115, "Frijol", 57, 15.1);
        articulos[6] = new Articulo(116, "Manzanas", 98, 16.5);
        articulos[7] = new Articulo(117, "Aguacate", 14, 17.2);
        articulos[8] = new Articulo(118, "Pepsi", 6, 18.4);
        articulos[9] = new Articulo(119, "Papel", 1, 19.7);
        return articulos;
    }

    /**
     * Imprime todos los articulos
     *
     * @param articulos
     */
    public void printArticulos(Articulo[] articulos) {
        for (Articulo articulo : articulos) {
            articulo.printMe();
        }
    }

    /**
     * Busca un articulo en base a su codigo
     *
     * @param articulos
     * @param codigoArticulo
     * @return
     */
    public Articulo buscarArticuloPorCodigo(Articulo[] articulos, int codigoArticulo) {
        for (Articulo articulo : articulos) {
            if (articulo.getCodigo() == codigoArticulo) {
                return articulo;
            }
        }
        return null;
    }

    /**
     * Busca un articulo en base a su nombre
     *
     * @param articulos
     * @param nombreArticulo
     * @return
     */
    public Articulo buscarArticuloPorNombre(Articulo[] articulos, String nombreArticulo) {
        for (Articulo articulo : articulos) {
            if (articulo.getNombre().equalsIgnoreCase(nombreArticulo)) {
                return articulo;
            }
        }
        return null;
    }

}

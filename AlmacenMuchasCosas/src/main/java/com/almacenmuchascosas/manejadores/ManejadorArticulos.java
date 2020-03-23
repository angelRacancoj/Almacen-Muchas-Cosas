package com.almacenmuchascosas.manejadores;

import com.almacenmuchascosas.articulo.Articulo;
/**
 *
 * @author angelrg
 */
public class ManejadorArticulos {
    
    public Articulo[] crearDatos() {
            Articulo[] articulos = new Articulo[7];
            articulos[0] = new Articulo(randCodigo(), 333, "Producto1", 5, 15.00); 
            articulos[1] = new Articulo(444, "Producto2", 10, 11.50);
            articulos[2] = new Articulo(555, "Producto3", 50, 5.55);
            articulos[3] = new Articulo(777, "Producto4", 15, 33.00);
            articulos[4] = new Articulo(888, "Producto5", 22, 14.50);
            articulos[5] = new Articulo(999, "Producto6", 18, 7.75);
            articulos[6] = new Articulo(010, "Producto7", 9, 3.90);
            System.out.println("");
          
            return articulos;
    }

    /**
     * busqueda de articulo con codigo
     * @param articulos
     * @param Codigo
     * @return 
     */
    public Articulo buscarArticulo(Articulo[] articulos, int Codigo) {
        for (Articulo articulo : articulos) {
            if (articulo.getCodigo()==Codigo) {
                return articulo;
            }
        }
        return null;
    
   
    public void printArticulo(Articulo[] articulos) {
        for (Articulo articulo : articulos) {
            articulo.printMe();
        }
    
    
    }
     private int randCodigo() {
        int numero = (int) (Math.random() * 1000);
        return numero;
    }
    
}

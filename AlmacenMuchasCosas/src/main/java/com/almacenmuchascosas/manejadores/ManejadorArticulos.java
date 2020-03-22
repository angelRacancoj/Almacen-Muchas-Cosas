package com.almacenmuchascosas.manejadores;

import com.almacenmuchascosas.articulo.Articulo;

/**
 *
 * @author angelrg
 */
public class ManejadorArticulos {
    public Articulo[] crearDatos() {
        Articulo[] Articulos = new Articulo[5];
        Articulos[0] = new Articulo(1,"nombre",100,2.3 );
        Articulos[1] =  new Articulo(2,"laptop",10,2300 );
        Articulos[2] =  new Articulo(3,"lapiz",1001,1 );
        Articulos[3] =  new Articulo(4,"estuche",60,2 );
        Articulos[4] =  new Articulo(5,"gorra",70,20 );
        return Articulos;
    }
    
    public Articulo buscarArticulo(Articulo[] Articulos, int codigo){
        for (Articulo articulo : Articulos) {
            if (articulo.getCodigo() == codigo) {
                return articulo;
            }
        }
        return null;
        
    }
    public void mostrarArticulos(Articulo[] Articulos){
    for (int i = 0; i < Articulos.length; i++) {
            Articulos[i].printMe();
        }
    }
}

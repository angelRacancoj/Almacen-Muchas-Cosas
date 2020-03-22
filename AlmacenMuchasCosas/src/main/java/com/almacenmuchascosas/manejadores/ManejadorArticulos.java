package com.almacenmuchascosas.manejadores;

import com.almacenmuchascosas.articulo.Articulo;

/**
 *
 * @author angelrg
 */
public class ManejadorArticulos {
    
    public Articulo[] crearArticulos(){
        Articulo[] articulos = new Articulo[10];
        articulos[0] = new Articulo(101, "Cereal",2,5.5);
        articulos[1] = new Articulo(102, "Frijol",15,6);
        articulos[2] = new Articulo(103, "Arroz",30,5.5);
        articulos[3] = new Articulo(104, "Sal",40,2);
        articulos[4] = new Articulo(105, "Azúcar Morena",9,3.5);
        articulos[5] = new Articulo(106, "Consome",12,1);
        articulos[6] = new Articulo(107, "Gel Antibacterial xd",1,125);
        articulos[7] = new Articulo(108, "Papel Higiénico",50,4);
        articulos[8] = new Articulo(109, "Fideos",26,3.5);
        articulos[9] = new Articulo(110, "Aceite",5,10);
        return articulos;
    }
    
    public void buscarArticulo(Articulo[] articulos, int codigo) {
        boolean existe = false;
        for (Articulo articulo : articulos) {
            if (articulo.getCodigo() == codigo) {
                articulo.printMe();
                existe = true;
            }
        }
        if (existe == false) {
            System.out.println("El Artículo no existe");
        }
    }
    
    public Articulo devolverArticulo(Articulo[] articulos, int codigo){
        boolean existe = false;
        for (Articulo articulo : articulos) {
            if (articulo.getCodigo() == codigo) {
                return articulo;
                
            }
        }
        if (existe == false) {
            System.out.println("El Artículo no existe");
            return null;
        }
        return null;
    }
    
    /**
     *Sirve para mostrar los articulos en existencia
     * @param articulos
     */
    public void printArticulos(Articulo[] articulos){
        for (Articulo articulo : articulos) {
            articulo.printMe();
        }
    }
    
}

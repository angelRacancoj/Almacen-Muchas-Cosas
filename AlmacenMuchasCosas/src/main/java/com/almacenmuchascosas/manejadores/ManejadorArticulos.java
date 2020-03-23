package com.almacenmuchascosas.manejadores;

import com.almacenmuchascosas.articulo.Articulo;

/**
 *
 * @author angelrg
 */
public class ManejadorArticulos {
     private int codigo;
    
    public Articulo[] crearDatos(){
        
        Articulo[] articulos = new Articulo[10];
        
        articulos[0] = new Articulo(randCodigo(), "Papel Higienico(Paquete 12 u.)", 18,66.00);
        articulos[1] = new Articulo(randCodigo(), "Suavizante Suavitel", 58,39.99);
        articulos[2] = new Articulo(randCodigo(), "Baguette Blaco",25 ,6.00);
        articulos[3] = new Articulo(randCodigo(), "Aceite de Oliva(1000 ML)", 78,87.99);
        articulos[4] = new Articulo(randCodigo(), "Mayonesa(Paquete 2 u.)",98,20.75);
        articulos[5] = new Articulo(randCodigo(), "Margarina(Paquete 4 u.)", 20,20.00);
        articulos[6] = new Articulo(randCodigo(), "Salsa Ketchup", 40,19.50);
        articulos[7] = new Articulo(randCodigo(), "Pasta INA(Paquete 4 u.)", 39,10.00);
        articulos[8] = new Articulo(randCodigo(), "Arroz El Molinero", 75,15.75);
        articulos[9] = new Articulo(randCodigo(), "Café Nescafé", 36,30.00);
        
        return articulos;
        }
    
        public void printArticulo (Articulo[] articulos){
            for (Articulo articulo : articulos) {
                articulo.prinMe();
        }
        }
        
        private int randCodigo(){
       int numero = (int)(Math.random()*1000);
        return numero;
        } 
        
        public Articulo buscarArticulo(Articulo[]articulos){
            
            for (Articulo articulo:articulos){

                if (articulo.getCodigo()== codigo){
                    return articulo;
            }
        }
          return null;   
        }    
        
}

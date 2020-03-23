package com.almacenmuchascosas.manejadores;

import com.almacenmuchascosas.articulo.Articulo;


public class ManejadorArticulos {
    
    
    
    //////////////////////////////////////////////////
    
    public Articulo [] generarDatosArticulos() {
      
        Articulo []  articulo =  new Articulo[10] ; 
        
        articulo [0] = new Articulo(1, "Navaja", 5, 12.5);
        articulo [1] = new Articulo(2, "Cinta",  8, 3.5);
        articulo [2] = new Articulo(50, "Pegamento", 15, 5.5);
        articulo [3] = new Articulo(50, "Tornollos ", 15, 1.5);
        articulo [4] = new Articulo(70, "Engranes", 25, 6.5);
        articulo [5] = new Articulo(55, "Tubos pvc", 10, 7.5);
        articulo [6] = new Articulo(33, "Destornilladores ", 7 , 10);
        articulo [7] = new Articulo(22, "Pinzas", 15, 5.5);
        articulo [8] = new Articulo(11, "Alicates", 15, 5.5);
        articulo [9] = new Articulo(66, "Serrucho", 9, 25.5);
       return articulo; 

    }
    

    // mostrar articulos
   // imprimir los valores almacenados 
  
      
    // imprimir los valores almacenados de  los articulos
    public void printClientes(Articulo [] articulo) {
        for (Articulo articulo1 : articulo) {
            articulo1.printMe();
        }
    }
    
   
    //buscar articulos por codigo de articulo  
  
 
    public String  buscarArticuloCodigo( int codigoArticulo, Articulo[] articulo) {
         
        for (Articulo articulo1 : articulo) {
            if (articulo1.getCodigo() == codigoArticulo) {
                return articulo1.getNombre();
            
            } else {
                System.out.println(" El codigo del Articulo no existe");
        
            }
        return null; 
        }
        

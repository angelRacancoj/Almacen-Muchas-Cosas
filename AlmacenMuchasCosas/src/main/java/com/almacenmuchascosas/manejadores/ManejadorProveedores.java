package com.almacenmuchascosas.manejadores;

import com.almacenmuchascosas.articulo.Articulo;
import com.almacenmuchascosas.entidades.Proveedor;
import com.almacenmuchascosas.factura.Factura;

public class ManejadorProveedores {
    
  
    ///////////////////////////////////////////////////////////////////////
    
    
   public  Proveedor [] generarDatosProveedores() {
      // la cantidad de proveedores sera de 10 
      Proveedor[]  proveedores =  new Proveedor[5]; 
      
              proveedores[0] = new Proveedor( "555", "Ike",     "58-99" , 77858889,"Entidad S:A");
              proveedores[1] = new Proveedor( "8988989", "Carl", "00-99" , 77459696,"Empresa SK ");
              proveedores[2] = new Proveedor( "5559", "Carlos", "15-20" , 77858810," Distribidora S.A");
              proveedores[3] = new Proveedor( "9669", "Mary", "966-66" , 77858815,"Delsa S.A");
              proveedores[4] = new Proveedor( "2559", "Anika", "31-77" , 77859667,"Myoreos M.G");
             return proveedores;
    
    
    
}
   // imprimir los valores almacenados 
    public void printProveedores  (Proveedor[] proveedor) {
     
        for (Proveedor proveedor1 : proveedor) {
           proveedor1.printMe();
        
       }
    }
    
   
    
    
    


    
    
   // se   recorre el arreglo  para ver si el nit existe 
  
    public Proveedor buscarProveedor(String Nit, Proveedor []  proveedor) {
       
       for (Proveedor proveedor1 : proveedor) {
           if (proveedor1.getNIT().equalsIgnoreCase(Nit) )
                  return proveedor1; 
       
       }
       return null;
       }

   
   // se ve los articulos que los proveedores tienen 

   public Articulo articuloProveedor(String Nit, Proveedor [] proveedores, Factura factura ) {
       
       
       Articulo  car = new Articulo() ; 
       factura = null;  
       
       for (Proveedor proveedore : proveedores) {
           if ( proveedore.getNIT().equals(Nit) &&  factura  !=null   ){
               
               
               return car; 
           }
           
           
       }
 
       
       return null;
 
       
   }

 

}

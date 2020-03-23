package com.almacenmuchascosas.manejadores;

import com.almacenmuchascosas.entidades.Proveedor;

/**
 *
 * @author angelrg
 */
public class ManejadorProveedores {
  private String NIT;
    
    public Proveedor[] crearDatos(){
        
        Proveedor[] proveedores = new Proveedor[10];
        
        proveedores[0] = new Proveedor(randNIT(), "Juan", "ciudad", randtelefono(), "Juan");
        proveedores[1] = new Proveedor(randNIT(), "El Manantial", "ciudad", randtelefono(), "William");
        proveedores[2] = new Proveedor(randNIT(), "Piedra Dorada", "ciudad", randtelefono(), "Alex");
        proveedores[3] = new Proveedor(randNIT(), "Jehova", "ciudad", randtelefono(), "Ale");
        proveedores[4] = new Proveedor(randNIT(), "Pedro", "ciudad", randtelefono(), "Pedro");
        proveedores[5] = new Proveedor(randNIT(), "El Milagro", "ciudad", randtelefono(), "Manuel");
        proveedores[6] = new Proveedor(randNIT(), "Esteban", "ciudad", randtelefono(), "Esteban");
        proveedores[7] = new Proveedor(randNIT(), "Luis", "ciudad", randtelefono(), "Luis");
        proveedores[8] = new Proveedor(randNIT(), "Felicidad", "ciudad", randtelefono(), "Pilar");
        proveedores[9] = new Proveedor(randNIT(), "José", "ciudad", randtelefono(), "José");
        
        return proveedores;
        }
    
        public void printProveedores (Proveedor[] proveedores){
            for (Proveedor proveedor : proveedores) {
                proveedor.prinMe();
        }
        }
        
        private String randNIT(){
       int numero = (int)(Math.random()*1000);
        return String.valueOf(numero);
        } 
        
        private int randtelefono(){
       int numero = (int)(Math.random()*99000000+10000000);
        return numero;
        } 
        
        public Proveedor buscarProveedor(Proveedor[]proveedores){
            
            for (Proveedor proveedor:proveedores){

                if (proveedor.getNIT().equalsIgnoreCase(NIT)){
                    return proveedor;
            }
        }
          return null;   
        }
        
        public Proveedor artículosProveedor(Proveedor[]proveedores){
            //requiere de datos de factura
            return null;
        }
        
}


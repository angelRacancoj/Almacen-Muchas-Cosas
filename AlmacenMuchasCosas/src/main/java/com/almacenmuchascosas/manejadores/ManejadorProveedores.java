package com.almacenmuchascosas.manejadores;

import com.almacenmuchascosas.entidades.Proveedor;

/**
 *
 * @author angelrg
 */
public class ManejadorProveedores {
    
    public Proveedor[] crearProveedores(){
        Proveedor[] proveedores = new Proveedor[10];
        proveedores[0]= new Proveedor("001", "Pro 1", "Ciudad",1231,"María");
        proveedores[1]= new Proveedor("002", "Pro 2", "Ciudad",1232,"Juana");
        proveedores[2]= new Proveedor("003", "Pro 3", "Ciudad",1233,"Luis");
        proveedores[3]= new Proveedor("004", "Pro 4", "Ciudad",1234,"Jenni");
        proveedores[4]= new Proveedor("005", "Pro 5", "Ciudad",1235,"Vicente");
        proveedores[5]= new Proveedor("006", "Pro 6", "Ciudad",1236,"Cristiano");
        proveedores[6]= new Proveedor("007", "Pro 7", "Ciudad",1237,"Pedro");
        proveedores[7]= new Proveedor("008", "Pro 8", "Ciudad",1238,"Hector");
        proveedores[8]= new Proveedor("009", "Pro 9", "Ciudad",1239,"Alfonso");
        proveedores[9]= new Proveedor("010", "Pro 10", "Ciudad", 12310,"Hitler");
        return proveedores;
    }
    
    /**
     * Este metodo realiza la busqueda mediante el nit del cliente
     *
     * @param proveedores
     * @param NIT
     * devuelve los datos del Proveedor según su NIT
    */ 
    public void buscarProveedor(Proveedor[] proveedores, String NIT) {
        boolean existe = false;
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getNIT().equalsIgnoreCase(NIT)) {
                proveedor.printMe();
                existe = true;
            }
        }
        if (existe == false) {
            System.out.println("El Proveedor no existe");
        }
    }
    
    public void printProveedores(Proveedor[] proveedores) {
        for (Proveedor proveedore : proveedores) {
            proveedore.printMe();
        }
    }
    
}

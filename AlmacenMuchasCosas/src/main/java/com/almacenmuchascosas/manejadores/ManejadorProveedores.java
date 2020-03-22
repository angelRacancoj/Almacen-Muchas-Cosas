package com.almacenmuchascosas.manejadores;

import com.almacenmuchascosas.entidades.Proveedor;
import com.almacenmuchascosas.factura.FacturaProveedor;

/**
 *
 * @author angelrg
 */
public class ManejadorProveedores {
    /**
     * Este metodo crea una lista de proveedores
     *
     * @return
     */
    public Proveedor[] crearDatos() {
        Proveedor[] proveedores = new Proveedor[4];
        proveedores[0] = new Proveedor("990", "SOLOM", "ciudad", 555, "Juan");        
        proveedores[1] = new Proveedor("991", "TRADUSH", "ciudad", 556, "Pedro");  
        proveedores[2] = new Proveedor("992", "MONDIMA", "ciudad", 557, "Pepe");  
        proveedores[3] = new Proveedor("993", "LITH", "ciudad", 558, "Maria");   
        return proveedores;
    }
    
    /**
     * Este metodo realiza la busqueda mediante el nit del proveedor
     *
     * @param proveedores
     * @param NIT
     * @return
     */
    public Proveedor buscarProveedor(Proveedor[] proveedores, String NIT) {
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getNIT().equalsIgnoreCase(NIT)) {
                return proveedor;
            }
        }
        return null;
    }
    
    public void printProveedores(Proveedor[] proveedores) {
        for (int i = 0; i < proveedores.length; i++) {
            proveedores[i].printMe();
        }
    }
    
    public void  articulosProveedor(Proveedor[] proveedores,String NIT ,FacturaProveedor facturaProveedor){     
        Proveedor proveedor = this.buscarProveedor(proveedores,NIT);
        if(proveedor != null){
            if(facturaProveedor.getProveedor() == proveedor){            
                facturaProveedor.printArticulos();
            }
        }        
    }
}

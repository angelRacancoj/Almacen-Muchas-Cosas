package com.almacenmuchascosas.manejadores;

import com.almacenmuchascosas.entidades.Proveedor;
import com.almacenmuchascosas.factura.FacturaProveedor;
/**
 *
 * @author angelrg
 */
public class ManejadorProveedores {
    public Proveedor[] crearDatos(){
    Proveedor[] proveedores = new Proveedor[5];
    proveedores[0] = new Proveedor("1","Empresa","Ciudad",1234678,"NOmbreCOntanto");
    proveedores[1] = new Proveedor("2","Empresa1","Ciudad",87654321,"NOmbreCOntanto");
    proveedores[2] = new Proveedor("3","Empresa2","Ciudad",9632547,"NOmbreCOntanto");
    proveedores[3] = new Proveedor("4","Empresa3","Ciudad",3654794,"NOmbreCOntanto");
    proveedores[4] = new Proveedor("5","Empresa4","Ciudad",98731246,"NOmbreCOntanto");
        return proveedores;
}
    public Proveedor buscarProveedor(Proveedor[] proveedores, String NIT){
         for (Proveedor proveedor : proveedores) {
            if (proveedor.getNIT().equalsIgnoreCase(NIT)) {
                return proveedor;
            }
        }
        return null;
    }
    public void mostrarProveedores(Proveedor[] proveedores){
        for (int i = 0; i < proveedores.length; i++) {
            proveedores[i].printMe();
        }
    }
    public void articulosProveedor(Proveedor[] proveedores,String NIT, FacturaProveedor facturasProveedor){
        Proveedor Proveedor = buscarProveedor(proveedores,NIT);
        if(Proveedor != null && facturasProveedor.getProveedor() == Proveedor){
            facturasProveedor.mostrarArticulos();
        }
    }
}

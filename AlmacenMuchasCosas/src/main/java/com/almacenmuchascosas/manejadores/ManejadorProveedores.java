package com.almacenmuchascosas.manejadores;

import com.almacenmuchascosas.entidades.Proveedor;

/**
 *
 * @author angelrg
 */
public class ManejadorProveedores {

    public Proveedor[] crearProveedores() {
        Proveedor[] proveedores = new Proveedor[4];
        proveedores[0] = new Proveedor("001", "proveedorCero", "ciudad", 10001, "Alejandra");
        proveedores[1] = new Proveedor("002", "proveedorUno", "ciudad", 10002, "Pedro");
        proveedores[2] = new Proveedor("003", "proveedorDos", "ciudad", 10003, "Ivan");
        proveedores[3] = new Proveedor("004", "proveedorTres", "ciudad", 10004, "Rosa");
        return proveedores;
    }

    public Proveedor buscarPorveedor(Proveedor[] proveedores, String NIT, String nombre) {
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getNIT().equalsIgnoreCase(NIT) || proveedor.getNombre().equalsIgnoreCase(nombre)) {
                return proveedor;
            }
        }
        return null;
    }

}

package com.almacenmuchascosas.manejadores;

import com.almacenmuchascosas.entidades.Proveedor;

/**
 *
 * @author luisbs
 */
public class ManejadorProveedores {

    public Proveedor[] registrarProveedor() {

        Proveedor[] proveedores = new Proveedor[5];

        //Nit, nombre del proveedor, dirección, numero telefónico, nombre del contacto
        proveedores[0] = new Proveedor("255", "Luis", "07 calle 05 zona 1 Xela", 4546 - 8950, "Pesona/contacto: Martín");
        proveedores[1] = new Proveedor("265", "Maria", "28 calle 25 zona 3 Toto", 4645 - 8798, "Pesona/contacto:: Luis");
        proveedores[2] = new Proveedor("285", "Juan", "08 calle 08 zona 10 Momostenango", 2132 - 2958, "Pesona/contacto:: Jose");
        proveedores[3] = new Proveedor("155", "Young", "01 calle 15 zona 2 Jutiapa", 7687 - 8590, "Pesona/contacto:: Carlos");
        proveedores[4] = new Proveedor("055", "Marcos", "21 calle 25 zona 4 Tecpan", 3545 - 9499, "Pesona/contacto:: Juan");

        return proveedores;
    }

    public void imprimirProveedore(Proveedor[] proveedores) {

        Proveedor proveedor = null;

        /**for (int i = 0; i < proveedores.length; i++) {
            proveedor.mostrarDatosProveedor();
        }*/
        //codigo mejorado
        for (Proveedor prov : proveedores) {
            proveedor.mostrarDatosProveedor();
        }
    }
}

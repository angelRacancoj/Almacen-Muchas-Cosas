package com.almacenmuchascosas.manejadores;

import com.almacenmuchascosas.entidades.Proveedor;

/**
 *
 * @author angelrg
 */
public class ManejadorProveedores {
        public Proveedor[] crearDatos() {
            System.out.println("Proveedores: ");
            Proveedor[] proveedores = new Proveedor[5];
            proveedores[0] = new Proveedor(randNIT(), "Proveedor1", "Guatemala", 1234, "Martha");
            proveedores[1] = new Proveedor("9898", "Proveedor2", "Guatemala", 2341, "Gerson");
            proveedores[2] = new Proveedor("8989", "Proveedor3", "Guatemala", 3412, "Tommy");
            proveedores[3] = new Proveedor("8787", "Proveedor4", "Guatemala", 4123, "Elmer");
            proveedores[4] = new Proveedor("7878", "Proveedor5", "Guatemala", 2345, "Sully");
            System.out.println("");
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


    public void printProveedor(Proveedor[] proveedores) {
          for (int i = 0; i < proveedores.length; i++) {
            proveedores[i].printMe();
        } 
    }
    
    private String randNIT() {
        int numero = (int) (Math.random() * 1000);
        return String.valueOf(numero);
    }

}

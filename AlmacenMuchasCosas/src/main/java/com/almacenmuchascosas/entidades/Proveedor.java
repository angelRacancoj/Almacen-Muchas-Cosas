package com.almacenmuchascosas.entidades;

/**
 *
 * @author angelrg
 */
public class Proveedor extends Entidad {

    int telefono;
    String nombreContacto;

    public Proveedor() {
    }

    public Proveedor(String NIT, String nombre, String direccion, int telefono, String nombreContacto) {
        super(NIT, nombre, direccion);
        this.telefono = telefono;
        this.nombreContacto = nombreContacto;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    @Override
    public void printMe() {
        System.out.println("NIT: " + super.getNIT() + ", Nombre: " + super.getNombre() + ", Direccion:" + super.getDireccion() 
                + ", Telefono:" + this.telefono + ", Nombre de Contacto: " + this.nombreContacto);
    }
    
    
}

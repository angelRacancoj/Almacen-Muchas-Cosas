package com.almacenmuchascosas.articulo;

/**
 *
 * @author angelrg
 */
public class Articulo {

    private int codigo;
    private String nombre;
    private double existencia;
    private double precio;

    public Articulo() {
    }

    public Articulo(int codigo, String nombre, double existencia, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.existencia = existencia;
        this.precio = precio;
    }

    public Articulo(int randCodigo, int i, String producto1, int i0, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getExistencia() {
        return existencia;
    }

    public void setExistencia(double existencia) {
        this.existencia = existencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

    public void printMe() {
  
        System.out.println("Codigo: " + getCodigo() + ", Producto: " + getNombre() + ", Existencia: " + getExistencia() + ", Precio: " + getPrecio());
        
    }
}

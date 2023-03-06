package com.ej.practica_2.model;

public class Producto {
    private String nombre;
    private String desc;
    private double precio;

    public Producto(String nombre, String desc, double precio) {
        this.nombre = nombre;
        this.desc = desc;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
}

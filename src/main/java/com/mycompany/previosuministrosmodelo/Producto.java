/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.previosuministrosmodelo;

/**
 *
 * @author estudiantes
 */
public class Producto {
    private String nombre;
    private double valorUnitario;
    private int cantidad;
    private double total;

    public Producto(String nombre, double valorUnitario, int cantidad) {
        this.nombre = nombre;
        this.valorUnitario = valorUnitario;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public double getTotal(int cantidad, double valorUnitario){
        total=cantidad*valorUnitario;
        return total;
    }
    
}

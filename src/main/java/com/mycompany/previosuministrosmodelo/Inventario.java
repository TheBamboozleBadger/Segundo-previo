/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.previosuministrosmodelo;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author estudiantes
 */
public class Inventario {
    private List<Producto> productos= new ArrayList<>();
    
    public void agregar(Producto p){
        productos.add(p);
    }
    
    public void eliminar(int i){
        for(Producto j : productos){
            if(j.equals(productos.get(i))){
                productos.remove(j);
            }
        }
    
    }
    
    public void limpiar(){
        productos.clear();
    }
    
    public List<Producto> obtenerTodas(){
        return productos;
    }
}


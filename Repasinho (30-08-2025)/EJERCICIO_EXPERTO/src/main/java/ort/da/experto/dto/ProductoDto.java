/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ort.da.experto.dto;

import ort.da.facturas.modelo.Producto;

/**
 *
 * @author PC
 */
public class ProductoDto {
    private String nombre;
    private int precio;
    private int unidades;
    private String proveedor;
   

    public ProductoDto(Producto producto) {
        
        nombre = producto.getNombre();
        precio = producto.getPrecio();
        unidades = producto.getUnidades();
        proveedor = producto.getProveedor().getNombre();
      
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public String getProveedor() {
        return proveedor;
    }

  
    
    
    
}

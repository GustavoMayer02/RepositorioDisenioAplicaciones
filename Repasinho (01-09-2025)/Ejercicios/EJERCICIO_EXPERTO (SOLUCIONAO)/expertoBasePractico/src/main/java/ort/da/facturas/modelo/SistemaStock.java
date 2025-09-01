/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ort.da.facturas.modelo;

import java.util.ArrayList;

/**
 *
 * @author magda
 */
public class SistemaStock {
    
    private static SistemaStock instancia = new SistemaStock();

    private ArrayList<Producto> productos = new ArrayList();
    private ArrayList<Proveedor> proveedores = new ArrayList();
    
    public static SistemaStock getInstancia() {
        return instancia;
    }

    private SistemaStock() {
    }
    public void agregar(Producto p){
        productos.add(p);
        p.agregarAProveedor();
    }
     public void agregar(Proveedor p){
        proveedores.add(p);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }
    public Producto productoMasBarato(){
        Producto masBarato = null;
        for(Producto p:productos){
            if(masBarato==null) masBarato=p;
            else if(p.getPrecio()<masBarato.getPrecio()) masBarato = p;
        }
        return masBarato;
    }
   

    
}

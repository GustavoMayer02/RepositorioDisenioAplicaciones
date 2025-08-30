/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ort.da.facturas.modelo;

/**
 *
 * @author magda
 */
public class DatosPrueba {
    
    
    public static void cargar(){
       
        SistemaStock cs = SistemaStock.getInstancia();
        
        Proveedor pA = new Proveedor("Proveedor A");
        Proveedor pB = new Proveedor("Proveedor B");
        Proveedor pC = new Proveedor("Proveedor C");
        
        cs.agregar(pA);
        cs.agregar(pB);
        cs.agregar(pC);
        
        Producto caramelo = new Producto("Caramelo",2,3000,pA);
        Producto camisa = new Producto("Camisa",1300,1000,pB);
        Producto computadora = new Producto("Computadora",20000,40,pC);
        
        cs.agregar(caramelo);
        cs.agregar(camisa);
        cs.agregar(computadora);
        
        SistemaClientes cc = SistemaClientes.getInstancia();
        
        Cliente juan = new Cliente("Juan");
        Cliente ana = new Cliente("Ana");
        Cliente mario = new Cliente("Mario");
        
        cc.agregar(juan);
        cc.agregar(ana);
        cc.agregar(mario);
        
        SistemaFacturas cf = SistemaFacturas.getInstancia();
        
        Factura f1 = new Factura(juan);
        f1.agregar(30, caramelo);
        f1.agregar(2, camisa);
        f1.agregar(1, computadora);
        
        cf.agregar(f1);
        
        Factura f2 = new Factura(ana);
        f2.agregar(400, caramelo);
        f2.agregar(20, camisa);
        f2.agregar(10, computadora);
        
        cf.agregar(f2);
        
        Factura f3 = new Factura(mario);
        
        f3.agregar(1, camisa);
        f3.agregar(1, computadora);
        
        cf.agregar(f3);
    }
    
}

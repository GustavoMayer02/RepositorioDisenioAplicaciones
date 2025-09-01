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
public class Factura {

    private Cliente cliente;
    private ArrayList<LineaFactura> lineas = new ArrayList();

    public Factura(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<LineaFactura> getLineas() {
        return lineas;
    }

    public void agregar(int cantidad, Producto p) {
        lineas.add(new LineaFactura(p, cantidad));
    }

    @Override
    public String toString() {
        return "Factura{" + "cliente=" + cliente + ", lineas=" + lineas + '}';
    }

    public int getTotalFacturaXProducto(Producto unProducto) {
        int total = 0;

        for (LineaFactura lf : lineas) {
            if (tieneProducto(unProducto)) {
                total += lf.getTotalLinea();
            }
        }

        return total;
    }

    public boolean tieneProducto(Producto unProducto) {
        for (LineaFactura lf : lineas) {
            if (lf.getProducto().equals(unProducto)) {
                return true;
            }
        }

        return false;
    }
}

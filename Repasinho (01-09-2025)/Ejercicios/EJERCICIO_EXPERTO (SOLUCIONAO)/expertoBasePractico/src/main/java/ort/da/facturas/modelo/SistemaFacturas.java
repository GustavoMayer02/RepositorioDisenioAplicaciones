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
public class SistemaFacturas {

    private static SistemaFacturas instancia = new SistemaFacturas();

    private ArrayList<Factura> facturas = new ArrayList();

    public static SistemaFacturas getInstancia() {
        return instancia;
    }

    private SistemaFacturas() {
    }

    public void agregar(Factura c) {
        facturas.add(c);
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public boolean clienteComproProducto(Cliente cliente, Producto producto) {
        for (Factura f : facturas) {
            if (f.tieneProducto(producto) && f.getCliente().equals(cliente)) {
                return true;
            }
        }

        return false;
    }

    public int totalGastadoClienteProducto(Cliente cliente, Producto producto) {
        int total = 0;

        for (Factura factura : facturas) {
            if (factura.getCliente().equals(cliente) && clienteComproProducto(cliente, producto)) {
                total += factura.getTotalFacturaXProducto(producto);
            }
        }

        return total;
    }
}

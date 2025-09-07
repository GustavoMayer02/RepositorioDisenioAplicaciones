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

    public boolean clienteComproProducto(Cliente c, Producto p) {
        for (Factura f : facturas) {
            if (f.tieneProducto(p) && f.getCliente().equals(c)) {
                return true;
            }
        }

        return false;
    }

    public float obtenerTotalGastadoClienteProducto(Cliente c, Producto p) {
        float total = 0;

        for (Factura f : facturas) {
            if (clienteComproProducto(c, p)) {
                total += f.obtenerTotalXProducto(p);
            }
        }

        return total;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ort.da.facturas.modelo;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author magda
 */
public class SistemaClientes {

    private static SistemaClientes instancia = new SistemaClientes();

    private ArrayList<Cliente> clientes = new ArrayList();

    public static SistemaClientes getInstancia() {
        return instancia;
    }

    private SistemaClientes() {
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void agregar(Cliente c) {
        clientes.add(c);
    }

    public List<Cliente> clientesQueNoCompraronProductoMasBarato() {
        ArrayList<Cliente> auxiliar = new ArrayList<Cliente>();
        Producto producto = SistemaStock.getInstancia().productoMasBarato();

        for (Cliente cliente : clientes) {
            if (!SistemaFacturas.getInstancia().clienteComproProducto(cliente, producto)) {
                auxiliar.add(cliente);
            }
        }

        return auxiliar;
    }

}

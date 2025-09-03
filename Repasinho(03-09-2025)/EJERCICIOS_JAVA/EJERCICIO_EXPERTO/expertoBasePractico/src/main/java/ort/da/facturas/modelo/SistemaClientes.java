/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ort.da.facturas.modelo;

import java.util.ArrayList;
import java.util.List;

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
        List<Cliente> auxiliar = new ArrayList<Cliente>();
        Producto productoMasBarato = SistemaStock.getInstancia().productoMasBarato();

        for (Cliente c : clientes) {
            if (!SistemaFacturas.getInstancia().clienteComproProducto(c, productoMasBarato)) {
                auxiliar.add(c);
            }
        }

        return auxiliar;
    }

    public Cliente clienteQueGastoMasEnProducto(Producto producto) {
        Cliente cliente = null;
        int mayorMonto = 0;
        int totalGastado = 0;

        for (Cliente c : clientes) {
            totalGastado = SistemaFacturas.getInstancia().totalGastadoClienteProducto(c, producto);
            if (totalGastado > mayorMonto) {
                mayorMonto = totalGastado;
                cliente = c;
            }
        }

        return cliente;
    }

    public List<Cliente> clientesQueGastaronMasQueEnProducto(int monto, Producto producto) {
        List<Cliente> auxiliar = new ArrayList<Cliente>();
        int totalGastado = 0;

        for (Cliente c : clientes) {
            totalGastado = SistemaFacturas.getInstancia().totalGastadoClienteProducto(c, producto);
            if (totalGastado > monto) {
                auxiliar.add(c);
            }
        }

        return auxiliar;
    }
}

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
        Producto productoMasBarato = SistemaStock.getInstancia().productoMasBarato();
        List<Cliente> auxiliar = new ArrayList<Cliente>();

        for (Cliente cliente : clientes) {
            if (!SistemaFacturas.getInstancia().clienteComproProducto(cliente, productoMasBarato)) {
                auxiliar.add(cliente);
            }
        }

        return auxiliar;
    }

    public Cliente clienteQueGastoMasDineroEnProducto(Producto producto) {
        Cliente cliente = null;
        float gasto = 0;
        float gastoMayor = 0;

        for (Cliente c : clientes) {
            gasto = SistemaFacturas.getInstancia().totalGastadoClienteProducto(c, producto);

            if (gasto > gastoMayor) {
                gastoMayor = gasto;
                cliente = c;
            }
        }

        return cliente;
    }

    public List<Cliente> obtenerClientesQueGastaronMasQueXEnProducto(int monto, Producto producto) {
        List<Cliente> auxiliar = new ArrayList<Cliente>();

        for (Cliente cliente : clientes) {
            if (SistemaFacturas.getInstancia().totalGastadoClienteProducto(cliente, producto) > monto) {
                auxiliar.add(cliente);
            }
        }

        return auxiliar;
    }

}

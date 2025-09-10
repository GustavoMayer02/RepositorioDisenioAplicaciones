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

    public List<Cliente> clientesQueNuncaCompraronproductoMasBarato() {
        Producto pMasBarato = SistemaStock.getInstancia().productoMasBarato();
        List<Cliente> auxiliar = new ArrayList<Cliente>();

        for (Cliente c : clientes) {
            if (!SistemaFacturas.getInstancia().clienteComproProducto(c, pMasBarato)) {
                auxiliar.add(c);
            }
        }

        return auxiliar;
    }

    public Cliente clienteQueGastoMasEnXProducto(Producto p) {
        Cliente c = null;
        float gasto = 0;
        float gastoMayor = 0;

        for (Cliente cli : clientes) {
            gasto = SistemaFacturas.getInstancia().totalGastadoClienteProducto(cli, p);

            if (gasto > gastoMayor) {
                gastoMayor = gasto;
                c = cli;
            }
        }

        return c;
    }

    public List<Cliente> clientesQueGastaronMasQueEnProducto(int monto, Producto p) {
        List<Cliente> auxiliar = new ArrayList<Cliente>();

        for (Cliente c : clientes) {
            if (SistemaFacturas.getInstancia().totalGastadoClienteProducto(c, p) > monto) {
                auxiliar.add(c);
            }
        }

        return auxiliar;
    }
}

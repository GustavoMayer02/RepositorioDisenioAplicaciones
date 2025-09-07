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
        List<Cliente> auxiliar = new ArrayList<Cliente>();
        Producto productoMasBarato = SistemaStock.getInstancia().productoMasBarato();

        for (Cliente c : clientes) {
            if (!SistemaFacturas.getInstancia().clienteComproProducto(c, productoMasBarato)) {
                auxiliar.add(c);
            }
        }

        return auxiliar;
    }

    public Cliente obtenerClienteQueGastoMasEnproducto(Producto p) {
        Cliente c = null;
        float gasto = 0;
        float gastoMayor = 0;

        for (Cliente cliente : clientes) {
            gasto = SistemaFacturas.getInstancia().obtenerTotalGastadoClienteProducto(c, p);
            if (gasto > gastoMayor) {
                gastoMayor = gasto;
                c = cliente;
            }
        }

        return c;
    }

    public List<Cliente> obtenerClientesQueGastaronMasQueEnXProducto(int monto, Producto p) {
        List<Cliente> auxiliar = new ArrayList<Cliente>();

        for (Cliente c : clientes) {
            if (SistemaFacturas.getInstancia().obtenerTotalGastadoClienteProducto(c, p) > monto) {
                auxiliar.add(c);
            }
        }

        return auxiliar;
    }

}

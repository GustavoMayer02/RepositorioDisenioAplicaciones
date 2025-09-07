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

    public List<Cliente> clientesQueNuncaCompraronProductoMasBarato() {
        List<Cliente> auxiliar = new ArrayList<Cliente>();
        Producto masBarato = SistemaStock.getInstancia().productoMasBarato();

        for (Cliente c : clientes) {
            if (!SistemaFacturas.getInstancia().clienteComproProducto(c, masBarato)) {
                auxiliar.add(c);
            }
        }

        return auxiliar;
    }

    public Cliente clienteQueGastoMasXProducto(Producto p) {
        Cliente cliente = null;
        float mayorMonto = 0;
        float monto = 0;

        for (Cliente c : clientes) {
            monto = SistemaFacturas.getInstancia().obtenerTotalGastadoClienteProducto(c, p);
            if (monto > mayorMonto) {
                mayorMonto = monto;
                cliente = c;
            }
        }

        return cliente;
    }

    public List<Cliente> clientesQueGastaronMasXMontoEnProducto(int monto, Producto p) {
        List<Cliente> cAuxiliar = new ArrayList<Cliente>();

        for (Cliente c : clientes) {
            if (SistemaFacturas.getInstancia().obtenerTotalGastadoClienteProducto(c, p) > monto) {
                cAuxiliar.add(c);
            }
        }

        return cAuxiliar;
    }
}

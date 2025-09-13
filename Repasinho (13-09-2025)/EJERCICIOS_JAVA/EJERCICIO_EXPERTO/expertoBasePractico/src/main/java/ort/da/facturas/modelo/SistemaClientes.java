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

    public List<Cliente> obtenerClientesQueNoCompraronProductoMasBarato() {
        List<Cliente> auxiliar = new ArrayList<Cliente>();
        Producto masBarato = SistemaStock.getInstancia().productoMasBarato();

        for (Cliente c : clientes) {
            if (!SistemaFacturas.getInstancia().clienteComproProducto(c, masBarato)) {
                auxiliar.add(c);
            }
        }

        return auxiliar;
    }

    public Cliente obtenerClienteQueGastoMasEnUnProductoDado(Producto p) {
        Cliente c = null;
        float totalGastado = 0;
        float gastoMayor = 0;

        for (Cliente cli : clientes) {
            totalGastado = SistemaFacturas.getInstancia().obtenerTotalGastadoClienteProducto(cli, p);
            if (totalGastado > gastoMayor) {
                gastoMayor = totalGastado;
                c = cli;
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

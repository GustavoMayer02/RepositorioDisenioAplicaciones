/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ort.da.facturas.modelo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.data.mongo.MongoReactiveRepositoriesAutoConfiguration;

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
        for (Factura factura : facturas) {
            if (factura.getCliente().equals(cliente) && factura.tieneProducto(producto)) {
                return true;
            }
        }

        return false;
    }

    public int montoGastadoClienteProducto(Cliente cliente, Producto producto) {
        int total = 0;

        for (Factura factura : facturas) {
            if (factura.getCliente().equals(cliente) && factura.tieneProducto(producto)) {
                ArrayList<LineaFactura> lineasFacturas = factura.getLineas();

                for (LineaFactura lf : lineasFacturas) {
                    total += lf.getTotalLinea();
                }
            }
        }

        return total;
    }

    public Cliente clienteQueGastoMasEnUnProducto(Producto producto) {
        List<Cliente> listadoClientes = SistemaClientes.getInstancia().getClientes();
        // ACÁ VAMOS A GUARDAR EL CLIENTE QUE GASTÓ MÁS:
        Cliente cliente = null;

        for (Cliente c : listadoClientes) {
            if (cliente == null) {
                cliente = c;
            } else if (montoGastadoClienteProducto((cliente), producto) < montoGastadoClienteProducto(c, producto)) {
                cliente = c;
            }
        }

        return cliente;
    }

    public List<Cliente> obtenerClientesGastaronMasQueEnProducto(int monto, Producto producto) {
        List<Cliente> listadoClientes = SistemaClientes.getInstancia().getClientes();
        List<Cliente> clientesQueGastaronMas = new ArrayList<Cliente>();

        for (Cliente cliente : listadoClientes) {
            if (clienteComproProducto(cliente, producto)) {
                int totalGastadoProducto = montoGastadoClienteProducto(cliente, producto);
                if (totalGastadoProducto > monto) {
                    clientesQueGastaronMas.add(cliente);
                }
            }
        }

        return clientesQueGastaronMas;
    }
}

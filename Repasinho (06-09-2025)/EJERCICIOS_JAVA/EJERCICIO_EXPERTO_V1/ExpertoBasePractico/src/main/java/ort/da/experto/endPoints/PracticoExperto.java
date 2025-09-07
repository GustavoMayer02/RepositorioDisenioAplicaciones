/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ort.da.experto.endPoints;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ort.da.experto.dto.ProductoDto;
import ort.da.facturas.modelo.Cliente;
import ort.da.facturas.modelo.Producto;
import ort.da.facturas.modelo.SistemaClientes;
import ort.da.facturas.modelo.SistemaFacturas;
import ort.da.facturas.modelo.SistemaStock;

/**
 *
 * @author PC
 */
@RestController
@RequestMapping("/experto")

public class PracticoExperto {

    @GetMapping("/ejercicio1_1")
    public ProductoDto productoMasBarato() {

        Producto producto = SistemaStock.getInstancia().productoMasBarato();
        return new ProductoDto(producto);
    }

    @GetMapping("/ejercicio1_2")
    public Boolean clienteComproProducto(@RequestParam int posCliente, @RequestParam int posProducto) {

        Cliente cliente = SistemaClientes.getInstancia().getClientes().get(posCliente);
        Producto producto = SistemaStock.getInstancia().getProductos().get(posProducto);

        System.out.println("Cliente:" + cliente.toString());
        System.out.println("Producto:" + producto.toString());

        return SistemaFacturas.getInstancia().clienteComproProducto(cliente, producto);
    }

    @GetMapping("/ejercicio1_3")
    public List<Cliente> clientesQueNuncaCompraronProductoMasBarato() {
        return SistemaClientes.getInstancia().clientesQueNoCompraronProductoMasBarato();
    }

    @GetMapping("/ejercicio2_1")
    public Cliente obtenerClienteQueGastoMasEnProducto(@RequestParam int posProducto) {
        Producto producto = SistemaStock.getInstancia().getProductos().get(posProducto);
        return SistemaClientes.getInstancia().obtenerClienteQueGastoMasEnproducto(producto);
    }

    @GetMapping("/ejercicio3_1")
    public float obtenerTotalGastadoClienteProducto(int posCliente, int posProducto) {
        Producto producto = SistemaStock.getInstancia().getProductos().get(posProducto);
        Cliente cliente = SistemaClientes.getInstancia().getClientes().get(posCliente);

        return SistemaFacturas.getInstancia().obtenerTotalGastadoClienteProducto(cliente, producto);
    }

    @GetMapping("/ejercicio3_2")
    public List<Cliente> obtenerClientesQueGastaronMasQueEnXProducto(int monto, int posProducto) {
        Producto producto = SistemaStock.getInstancia().getProductos().get(posProducto);
        return SistemaClientes.getInstancia().obtenerClientesQueGastaronMasQueEnXProducto(monto, producto);
    }

}

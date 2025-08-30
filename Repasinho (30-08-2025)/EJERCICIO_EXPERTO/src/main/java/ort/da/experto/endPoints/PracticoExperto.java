/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ort.da.experto.endPoints;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("/ejercicio1_1")
    public ProductoDto productoMasBarato() {

        Producto producto = SistemaStock.getInstancia().productoMasBarato();
        return new ProductoDto(producto);
    }

    @PostMapping("/ejercicio1_2")
    public Boolean clienteComproProducto(@RequestParam int posCliente, @RequestParam int posProducto) {

        Cliente cliente = SistemaClientes.getInstancia().getClientes().get(posCliente);
        Producto producto = SistemaStock.getInstancia().getProductos().get(posProducto);

        System.out.println("Cliente:" + cliente.toString());
        System.out.println("Producto:" + producto.toString());

        // continua...
        return SistemaFacturas.getInstancia().clienteComproProducto(cliente, producto);
    }

    @PostMapping("/ejercicio1_3")
    public List<Cliente> clientesNoCompraronProductoMasBarato() {
        return SistemaClientes.getInstancia().clientesQueNoCompraronProductoMasBarato();
    }

    @GetMapping("/ejercicio2_1")
    public Cliente obtenerClienteQueMasGastoXProducto(@RequestParam int posProducto) {
        Producto producto = SistemaStock.getInstancia().getProductos().get(posProducto);

        return SistemaFacturas.getInstancia().clienteQueGastoMasEnUnProducto(producto);
    }

    @GetMapping("/ejercicio3_1")
    public int montoGastadoClienteProducto(@RequestParam int posCliente, @RequestParam int posProducto) {
        Cliente cliente = SistemaClientes.getInstancia().getClientes().get(posCliente);
        Producto producto = SistemaStock.getInstancia().getProductos().get(posProducto);

        return SistemaFacturas.getInstancia().montoGastadoClienteProducto(cliente, producto);
    }

    @GetMapping("/ejercicio3_2")
    public List<Cliente> obtenerClientesGastaronMasQueEnProducto(@RequestParam int monto,
            @RequestParam int posProducto) {
        Producto producto = SistemaStock.getInstancia().getProductos().get(posProducto);
        return SistemaFacturas.getInstancia().obtenerClientesGastaronMasQueEnProducto(monto, producto);
    }

}

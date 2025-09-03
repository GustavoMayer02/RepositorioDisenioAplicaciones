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

        return SistemaFacturas.getInstancia().clienteComproProducto(cliente, producto);
    }

    /*
     * ¿Qué clientes nunca han comprado el producto más barato? La consulta debe
     * retornar
     * una colección de objetos Cliente.
     */
    @GetMapping("/ejercicio1_3")
    public List<Cliente> clientesQueNoCompraronProductosMasBarato() {
        return SistemaClientes.getInstancia().clientesQueNoCompraronProductoMasBarato();
    }

    /*
     * Dado un producto x, ¿Cuál es el cliente que (en total) ha gastado más dinero
     * en ese
     * producto?
     */

    @GetMapping("/ejercicio2_1")
    public Cliente clienteQueGastoMasEnProducto(@RequestParam int posProducto) {
        Producto producto = SistemaStock.getInstancia().getProductos().get(posProducto);
        return SistemaClientes.getInstancia().clienteQueGastoMasEnProducto(producto);
    }

    /*
     * 1) Dado un cliente y un producto, saber cuánto ha gastado ese cliente en ese
     * producto.
     */

    @GetMapping("/ejercicio3_1")
    public int obtenerTotalGastadoClienteProducto(int posCliente, int posProducto) {
        Cliente cliente = SistemaClientes.getInstancia().getClientes().get(posCliente);
        Producto producto = SistemaStock.getInstancia().getProductos().get(posProducto);

        return SistemaFacturas.getInstancia().totalGastadoClienteProducto(cliente, producto);
    }

    /*
     * 2) Dado un monto y un producto saber qué clientes han gastado más de ese
     * monto en ese
     * producto. La consulta debe retornar una colección de objetos Cliente.
     */

    @GetMapping("/ejercicio3_2")
    public List<Cliente> clientesQueGastaronMasQueEnProducto(@RequestParam int monto, @RequestParam int posProducto) {
        Producto producto = SistemaStock.getInstancia().getProductos().get(posProducto);
        return SistemaClientes.getInstancia().clientesQueGastaronMasQueEnProducto(monto, producto);
    }
}

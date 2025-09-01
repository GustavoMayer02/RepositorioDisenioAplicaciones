package da.ejercicioCliente.test.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import da.ejercicioCliente.test.modelos.Cliente;

@RestController
@RequestMapping("/clientes")
public class BomDiaWorldController {

    @GetMapping("/bomDia")
    public Cliente crearCliente() {
        Cliente cliente = new Cliente();
        return cliente;
    }

    @PostMapping("/bomDia")
    public Cliente crearCliente(@RequestParam long cedula, @RequestParam String nombre) {
        Cliente cliente = new Cliente(cedula, nombre);
        return cliente;
    }
}

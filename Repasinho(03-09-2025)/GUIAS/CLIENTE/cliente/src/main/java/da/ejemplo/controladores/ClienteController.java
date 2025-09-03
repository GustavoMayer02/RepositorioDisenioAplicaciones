package da.ejemplo.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import da.ejemplo.modelos.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping("/crear")
    public Cliente crearCliente() {
        Cliente c = new Cliente();
        return c;
    }

    @PostMapping("/crear")
    public Cliente crearCliente(@RequestParam long cedula, @RequestParam String nombre) {
        Cliente c = new Cliente(cedula, nombre);
        return c;
    }
}

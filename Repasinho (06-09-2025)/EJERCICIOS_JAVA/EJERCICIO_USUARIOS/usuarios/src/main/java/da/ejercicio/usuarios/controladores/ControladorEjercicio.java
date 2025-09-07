package da.ejercicio.usuarios.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import da.ejercicio.usuarios.modelos.ServiciosUsuarios;
import da.ejercicio.usuarios.modelos.Usuario;

@RestController
@RequestMapping("/usuarios")
public class ControladorEjercicio {

    @GetMapping("/todos")
    public List<Usuario> todos() {
        return ServiciosUsuarios.getInstancia().getUsuarios();
    }

    @PostMapping("/consulta")
    public List<Usuario> consulta(@RequestParam int minutos) {
        return ServiciosUsuarios.getInstancia().usuariosConMayorAccesoA(minutos);
    }
}

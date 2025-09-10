package da.ejercicios.usuarios.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import da.ejercicios.usuarios.modelos.ServiciosUsuario;
import da.ejercicios.usuarios.modelos.Usuario;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping("/todos")
    public List<Usuario> todos() {
        return ServiciosUsuario.getInstancia().getUsuarios();
    }

    @GetMapping("/consulta")
    public List<Usuario> consulta(@RequestParam long minutos) {
        return ServiciosUsuario.getInstancia().obtenerUsuariosConAccesoMayorA(minutos);
    }
}

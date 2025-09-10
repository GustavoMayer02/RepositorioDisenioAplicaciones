package da.ejercicios.usuarios.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import da.ejercicios.usuarios.modelos.ServicioUsuario;
import da.ejercicios.usuarios.modelos.Usuario;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping("/todos")
    public List<Usuario> todos() {
        return ServicioUsuario.getInstancia().getUsuarios();
    }

    @GetMapping("/consulta")
    public List<Usuario> consulta(@RequestParam int minutos) {
        return ServicioUsuario.getInstancia().usuariosConAccesoMayorA(minutos);
    }
}

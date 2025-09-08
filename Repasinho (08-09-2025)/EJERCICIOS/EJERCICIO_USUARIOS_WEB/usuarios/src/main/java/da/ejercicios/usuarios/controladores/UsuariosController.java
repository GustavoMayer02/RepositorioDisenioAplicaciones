package da.ejercicios.usuarios.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import da.ejercicios.usuarios.modelos.ServiciosUsuario;
import da.ejercicios.usuarios.modelos.Usuario;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    @GetMapping("/todos")
    public List<Usuario> todos() {
        return ServiciosUsuario.getInstancia().getUsuarios();
    }

    @PostMapping("/consulta")
    public List<Usuario> consulta(@RequestParam int minutos) {
        return ServiciosUsuario.getInstancia().obtenerUsuariosConAccesoMayorDuracionQue(minutos);
    }
}

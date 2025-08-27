package usuarios.da.ejercicioUsuarios.endPoints;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import usuarios.da.ejercicioUsuarios.modelos.Usuario;
import usuarios.da.ejercicioUsuarios.servicios.ServiciosUsuario;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping("/todos")
    public List<Usuario> getAllUsuarios() {
        return ServiciosUsuario.getInstancia().getAllUsuarios();
    }

    @PostMapping("/consulta")
    public List<Usuario> consulta(@RequestParam int minutos) {
        return ServiciosUsuario.getInstancia().usuariosConMayorAccesoA(minutos);
    }
}

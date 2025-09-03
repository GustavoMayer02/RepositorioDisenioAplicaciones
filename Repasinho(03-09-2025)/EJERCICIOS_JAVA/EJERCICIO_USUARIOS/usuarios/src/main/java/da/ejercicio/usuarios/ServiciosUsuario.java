package da.ejercicio.usuarios;

import java.util.List;
import java.util.ArrayList;

public class ServiciosUsuario {
    private List<Usuario> usuarios = new ArrayList<Usuario>();

    public ServiciosUsuario() {

    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Usuario> usuariosConMayorDuracionAccesoQue(int minutos) {
        List<Usuario> users = new ArrayList<Usuario>();

        for (Usuario user : usuarios) {
            if (user.calcularDuracionTotalAcceso() > minutos) {
                users.add(user);
            }
        }

        return users;
    }

    public void agregarUsuario(Usuario user) {
        usuarios.add(user);
    }
}

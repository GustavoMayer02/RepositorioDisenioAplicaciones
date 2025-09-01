package da.usuarios.modelos;

import java.util.List;
import java.util.ArrayList;

public class ServiciosUsuario {
    private List<Usuario> usuarios = new ArrayList<Usuario>();

    public ServiciosUsuario() {
    }

    public void agregarUsuario(Usuario user) {
        usuarios.add(user);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Usuario> getUsuariosConMasDuracionQue(int duracion) {
        List<Usuario> listadoAuxiliar = new ArrayList<Usuario>();

        for (Usuario user : usuarios) {
            if (user.obtenerDuracionTotalAcceso() > duracion) {
                listadoAuxiliar.add(user);
            }
        }

        return listadoAuxiliar;
    }
}

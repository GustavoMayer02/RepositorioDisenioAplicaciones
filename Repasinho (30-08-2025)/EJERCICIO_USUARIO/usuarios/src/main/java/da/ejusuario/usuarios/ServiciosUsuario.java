package da.ejusuario.usuarios;

import java.util.List;
import java.util.ArrayList;

public class ServiciosUsuario {
    private List<Usuario> usuarios = new ArrayList<Usuario>();

    public ServiciosUsuario() {
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void agregarUsuario(Usuario user) {
        usuarios.add(user);
    }

    public List<Usuario> getUsuariosAccesoMasMintuos(int minutos) {
        List<Usuario> auxiliar = new ArrayList<Usuario>();

        for (Usuario usuario : usuarios) {
            if (usuario.getHabilitado() && usuario.tiempoTotalAcceso() > minutos) {
                auxiliar.add(usuario);
            }
        }

        return auxiliar;
    }

}

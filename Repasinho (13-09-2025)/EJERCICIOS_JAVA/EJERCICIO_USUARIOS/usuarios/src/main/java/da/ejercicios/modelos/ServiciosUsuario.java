package da.ejercicios.modelos;

import java.util.ArrayList;
import java.util.List;

public class ServiciosUsuario {
    private List<Usuario> usuarios = new ArrayList<Usuario>();

    public ServiciosUsuario() {
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void agregarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public List<Usuario> obtenerUsuariosConAccesoMayorQue(long minutos) {
        List<Usuario> auxiliar = new ArrayList<Usuario>();

        for (Usuario u : usuarios) {
            if (u.getHabilitado() && u.obtenerDuracionTotalAcceso() > minutos) {
                auxiliar.add(u);
            }
        }

        return auxiliar;
    }
}

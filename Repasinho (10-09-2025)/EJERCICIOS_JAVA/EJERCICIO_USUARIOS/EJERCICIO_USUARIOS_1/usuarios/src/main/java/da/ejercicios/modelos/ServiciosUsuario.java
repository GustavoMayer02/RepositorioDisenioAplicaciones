package da.ejercicios.modelos;

import java.util.ArrayList;
import java.util.List;

import da.ejercicios.modelos.Usuario;

public class ServiciosUsuario {
    private List<Usuario> usuarios = new ArrayList<Usuario>();

    public ServiciosUsuario() {
    }

    public void agregarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Usuario> obtenerUsuariosConMayorAccesoQue(int minutos) {
        List<Usuario> auxiliar = new ArrayList<Usuario>();

        for (Usuario u : usuarios) {
            if (u.getHabilitado() && u.obtenerTiempoTotalAcceso() > minutos) {
                auxiliar.add(u);
            }
        }

        return auxiliar;
    }
}

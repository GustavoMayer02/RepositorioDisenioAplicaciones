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

    public List<Usuario> obtenerUsuariosConAccesoMayorDuracionQue(long duracion) {
        List<Usuario> auxiliar = new ArrayList<Usuario>();

        for (Usuario u : usuarios) {
            if (u.getHabilitado() && u.calcularDuracionTotalAcceso() > duracion) {
                auxiliar.add(u);
            }
        }

        return auxiliar;
    }
}

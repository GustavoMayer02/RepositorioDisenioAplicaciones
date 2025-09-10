package da.ejercicios.usuarios.modelos;

import java.util.ArrayList;
import java.util.List;

public class ServicioUsuario {
    private static ServicioUsuario instancia;

    private ServicioUsuario() {
    }

    public static ServicioUsuario getInstancia() {
        if (instancia == null) {
            instancia = new ServicioUsuario();
        }

        return instancia;
    }

    List<Usuario> usuarios = new ArrayList<Usuario>();

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void agregarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public List<Usuario> usuariosConAccesoMayorA(int minutos) {
        List<Usuario> auxiliar = new ArrayList<Usuario>();

        for (Usuario u : usuarios) {
            if (u.getHabilitado() && u.obtenerDuracionTotalAccesos() > minutos) {
                auxiliar.add(u);
            }
        }

        return auxiliar;
    }
}

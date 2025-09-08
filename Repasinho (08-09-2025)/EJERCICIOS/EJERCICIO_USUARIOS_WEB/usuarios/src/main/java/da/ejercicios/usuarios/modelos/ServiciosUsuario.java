package da.ejercicios.usuarios.modelos;

import java.util.ArrayList;
import java.util.List;

public class ServiciosUsuario {
    private static ServiciosUsuario instancia;

    private ServiciosUsuario() {
    }

    public static ServiciosUsuario getInstancia() {
        if (instancia == null) {
            instancia = new ServiciosUsuario();
        }

        return instancia;
    }

    private List<Usuario> usuarios = new ArrayList<Usuario>();

    public void agregarUsuario(Usuario user) {
        usuarios.add(user);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Usuario> obtenerUsuariosConAccesoMayorDuracionQue(int duracion) {
        List<Usuario> auxiliar = new ArrayList<Usuario>();

        for (Usuario u : usuarios) {
            if (u.esHabilitado() && u.calcularTiempoTotalAcceso() > duracion) {
                auxiliar.add(u);
            }
        }

        return auxiliar;
    }
}

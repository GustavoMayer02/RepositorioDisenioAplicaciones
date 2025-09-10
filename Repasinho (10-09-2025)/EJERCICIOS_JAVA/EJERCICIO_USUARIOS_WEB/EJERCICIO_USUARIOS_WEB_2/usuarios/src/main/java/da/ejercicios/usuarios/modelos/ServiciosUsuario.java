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

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void agregarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public List<Usuario> obtenerUsuariosConAccesoMayorA(long minutos) {
        List<Usuario> auxiliar = new ArrayList<Usuario>();

        for (Usuario u : usuarios) {
            if (u.getHabilitado() && u.calcularDuracionTotalAcceso() > minutos) {
                auxiliar.add(u);
            }
        }

        return auxiliar;
    }
}

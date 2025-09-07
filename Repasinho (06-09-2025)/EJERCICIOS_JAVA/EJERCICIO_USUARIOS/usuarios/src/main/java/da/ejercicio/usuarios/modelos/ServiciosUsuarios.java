package da.ejercicio.usuarios.modelos;

import java.util.List;
import java.util.ArrayList;

public class ServiciosUsuarios {
    private static ServiciosUsuarios instancia;

    // CONSTRUCTOR PRIVADO PARA EVITAR QUE SE INSTANCIE DESDE FUERA DE LA CLASE.
    private ServiciosUsuarios() {

    }

    public static ServiciosUsuarios getInstancia() {
        if (instancia == null) {
            instancia = new ServiciosUsuarios();
        }

        return instancia;
    }

    public List<Usuario> usuarios = new ArrayList<Usuario>();

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void agregarUsuario(Usuario user) {
        usuarios.add(user);
    }

    public List<Usuario> usuariosConMayorAccesoA(int duracion) {
        List<Usuario> users = new ArrayList<Usuario>();

        for (Usuario user : usuarios) {
            if (user.getHabilitado() && user.tiempoTotalAcceso() > duracion) {
                users.add(user);
            }
        }

        return users;
    }
}

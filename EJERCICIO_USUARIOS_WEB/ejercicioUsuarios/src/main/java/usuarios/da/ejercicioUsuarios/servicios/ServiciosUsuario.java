package usuarios.da.ejercicioUsuarios.servicios;

import java.util.List;
import java.util.ArrayList;
import usuarios.da.ejercicioUsuarios.modelos.Usuario;;

public class ServiciosUsuario {
    private static ServiciosUsuario instancia;

    private List<Usuario> usuarios = new ArrayList<Usuario>();

    private ServiciosUsuario() {
        // EL CONSTRUCTOR ES PRIVADO PARA EVITAR QUE LO INSTANCIEN DESDE AFUERA.
    }

    public static ServiciosUsuario getInstancia() {
        if (instancia == null) {
            instancia = new ServiciosUsuario();
        }

        return instancia;
    }

    public List<Usuario> usuariosConMayorAccesoA(int duracion) {
        List<Usuario> aux = new ArrayList<Usuario>();

        for (Usuario user : usuarios) {
            if (user.isHabilitado() && user.tiempoTotalAcceso() > duracion) {
                aux.add(user);
            }
        }

        return aux;
    }

    public void addUsuario(Usuario user) {
        usuarios.add(user);
    }
}

package da.ejercicio.usuarios;

import java.util.ArrayList;
import java.util.List;

public class ServiciosUsuario {
    private ArrayList<Usuario> usuarios;

    public ServiciosUsuario() {
        this.usuarios = new ArrayList();
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void agregarUsuario(Usuario user) {
        usuarios.add(user);
    }

    public List<Usuario> obtenerUsuariosConMasMinutosQue(int minutos) {
        List<Usuario> auxiliar = new ArrayList<>();

        for (Usuario u : usuarios) {
            if (u.getHabilitado() && u.calcularDuracionAcceso() > minutos) {
                auxiliar.add(u);
            }
        }

        return auxiliar;
    }
}

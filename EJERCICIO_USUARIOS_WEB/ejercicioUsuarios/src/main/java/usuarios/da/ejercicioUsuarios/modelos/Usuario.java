package usuarios.da.ejercicioUsuarios.modelos;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String username;
    private String nombre;
    private String apellido;
    private boolean habilitado;
    private ArrayList<Acceso> accesos = new ArrayList<Acceso>();

    public Usuario(String username, String nombre, String apellido, boolean habilitado) {
        this.username = username;
        this.nombre = nombre;
        this.apellido = apellido;
        this.habilitado = habilitado;
    }

    public String getUserName() {
        return username;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public List<Acceso> getAccesos() {
        return accesos;
    }

    public int tiempoTotalAcceso() {
        int total = 0;

        for (Acceso a : accesos) {
            total += a.getDuracionEntrada();
        }

        return total;
    }

    public void agregarAcceso(Acceso acceso) {
        accesos.add(acceso);
    }

    @Override
    public String toString() {
        return nombre + "" + apellido;
    }
}

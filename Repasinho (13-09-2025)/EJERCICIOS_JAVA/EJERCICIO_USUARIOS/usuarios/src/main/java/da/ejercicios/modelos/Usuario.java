package da.ejercicios.modelos;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String username;
    private String nombre;
    private String apellido;
    private boolean habilitado;
    private List<Acceso> accesos = new ArrayList<Acceso>();

    public Usuario() {
    }

    public Usuario(String username, String nombre, String apellido, boolean habilitado) {
        this.username = username;
        this.nombre = nombre;
        this.apellido = apellido;
        this.habilitado = habilitado;
    }

    public String getUsername() {
        return username;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public boolean getHabilitado() {
        return habilitado;
    }

    public void agregarAcceso(Acceso a) {
        accesos.add(a);
    }

    public List<Acceso> getAccesos() {
        return accesos;
    }

    public long obtenerDuracionTotalAcceso() {
        long total = 0;

        for (Acceso a : accesos) {
            total += a.obtenerDuracionAcceso();
        }

        return total;
    }
}

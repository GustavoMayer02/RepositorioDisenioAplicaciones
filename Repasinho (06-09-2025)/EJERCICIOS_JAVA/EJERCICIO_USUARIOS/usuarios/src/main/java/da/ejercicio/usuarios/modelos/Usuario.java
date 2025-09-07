package da.ejercicio.usuarios.modelos;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
    private String userName;
    private String nombre;
    private String apellido;
    private boolean habilitado;

    private List<Acceso> accesos = new ArrayList<Acceso>();

    public Usuario() {
    }

    public Usuario(String userName, String nombre, String apellido, boolean habilitado) {
        this.userName = userName;
        this.nombre = nombre;
        this.apellido = apellido;
        this.habilitado = habilitado;
    }

    public String getUsername() {
        return userName;
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

    public int tiempoTotalAcceso() {
        int total = 0;

        for (Acceso a : accesos) {
            total += a.calcularAccesoMinutos();
        }

        return total;
    }

    @Override
    public String toString() {
        return nombre + " - " + apellido;
    }

}

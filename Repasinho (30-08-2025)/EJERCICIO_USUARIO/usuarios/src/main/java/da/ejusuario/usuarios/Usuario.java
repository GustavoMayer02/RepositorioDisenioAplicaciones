package da.ejusuario.usuarios;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
    private String userName;
    private String nombre;
    private String apellido;
    private boolean habilitado;
    private List<Acceso> accesos = new ArrayList<Acceso>();

    public Usuario(String userName, String nombre, String apellido, boolean habilitado) {
        this.userName = userName;
        this.nombre = nombre;
        this.apellido = apellido;
        this.habilitado = habilitado;
    }

    public String getUserName() {
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

    public List<Acceso> getAccesos() {
        return this.accesos;
    }

    public void agregarAcceso(Acceso acceso) {
        this.accesos.add(acceso);
    }

    public int tiempoTotalAcceso() {
        int tiempoTotal = 0;
        for (Acceso acceso : this.accesos) {
            tiempoTotal += acceso.getDuracionEnMinutos();
        }

        return tiempoTotal;
    }

    public String toString() {
        return this.nombre + "" + this.apellido;
    }

}

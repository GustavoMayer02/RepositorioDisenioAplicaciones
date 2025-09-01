package da.usuarios.modelos;

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

    public void agregarAcceso(Acceso acceso) {
        accesos.add(acceso);
    }

    public List<Acceso> getAccesos() {
        return accesos;
    }

    public long obtenerDuracionTotalAcceso() {
        long total = 0;

        for (Acceso acceso : accesos) {
            total += acceso.calcularTiempoAcceso();
        }

        return total;
    }

    @Override
    public String toString() {
        return nombre + " - " + apellido;
    }
}

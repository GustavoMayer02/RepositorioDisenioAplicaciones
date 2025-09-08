package da.ejercicios.usuarios.modelos;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String userName;
    private String nombre;
    private String apellido;
    private boolean habilitado;
    private List<Acceso> accesos;

    public Usuario() {
    }

    public Usuario(String userName, String nombre, String apellido, boolean habilitado) {
        this.userName = userName;
        this.nombre = nombre;
        this.apellido = apellido;
        this.habilitado = habilitado;
        this.accesos = new ArrayList<>();
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

    public boolean esHabilitado() {
        return habilitado;
    }

    public void agregarAcceso(Acceso acceso) {
        accesos.add(acceso);
    }

    public List<Acceso> getAccesos() {
        return accesos;
    }

    public long calcularTiempoTotalAcceso() {
        long total = 0;

        for (Acceso a : accesos) {
            total += a.obtenerMinutosAcceso();
        }

        return total;
    }
}

package da.ejercicios.usuarios.modelos;

import java.util.ArrayList;
import java.util.List;

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

    public List<Acceso> getAccesos() {
        return accesos;
    }

    public void agregarAcceso(Acceso a) {
        accesos.add(a);
    }

    public long obtenerDuracionTotalAccesos() {
        long total = 0;

        for (Acceso a : accesos) {
            total += a.calcularMinutosAcceso();
        }

        return total;
    }
}

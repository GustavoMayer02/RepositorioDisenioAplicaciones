package da.ejemplo.modelos;

import java.util.Date;

public class Cliente {
    private long cedula;
    private String nombre;
    private Date fechaCreacion;

    public Cliente() {
    }

    public Cliente(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaCreacion = new Date();
    }

    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

}

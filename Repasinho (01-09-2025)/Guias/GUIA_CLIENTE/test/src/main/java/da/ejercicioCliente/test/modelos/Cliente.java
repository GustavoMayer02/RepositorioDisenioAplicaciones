package da.ejercicioCliente.test.modelos;

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

    public String getNombre() {
        return nombre;
    }

    public Long getCedula() {
        return cedula;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    private void setCedula(long cedula) {
        this.cedula = cedula;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

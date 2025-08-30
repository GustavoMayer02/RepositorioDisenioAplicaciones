package ort.da.ejemploCliente.modelo;

import java.util.Date;

public class Cliente {
    private Long cedula;
    private String nombre;
    private Date fechaCreacion;

    public Cliente() {
    }

    public Cliente(Long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaCreacion = new Date();
    }

    public Long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaCreacion(Date fecha) {
        this.fechaCreacion = fecha;
    }

}

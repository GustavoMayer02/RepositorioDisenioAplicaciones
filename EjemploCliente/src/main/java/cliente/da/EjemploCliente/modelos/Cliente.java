package cliente.da.EjemploCliente.modelos;

import java.util.Date;

public class Cliente {
    private long cedula;

    private String nombre;

    private Date fechaCreacion;

    public Cliente() {
    }

    public Cliente(long cedulaC, String nombreC) {
        cedula = cedulaC;
        nombre = nombreC;
        fechaCreacion = new Date();
    }

    public String getNombre() {
        return nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setNombre(String nombreC) {
        nombre = nombreC;
    }

    public void setCedula(long cedulaC) {
        cedula = cedulaC;
    }
}

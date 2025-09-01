package da.usuarios.modelos;

import java.util.Date;

public class Acceso {
    private Date entrada;
    private Date salida;

    public Acceso() {
    }

    public Acceso(Date entrada, Date salida) {
        this.entrada = entrada;
        this.salida = salida;
    }

    public Date getEntrada() {
        return entrada;
    }

    public Date getSalida() {
        return salida;
    }

    public long calcularTiempoAcceso() {
        if (this.entrada == null || this.salida == null || this.salida.before(this.entrada)) {
            return -1;
        }
        return this.salida.getTime() - this.entrada.getTime() / (60 * 1000);
    }
}

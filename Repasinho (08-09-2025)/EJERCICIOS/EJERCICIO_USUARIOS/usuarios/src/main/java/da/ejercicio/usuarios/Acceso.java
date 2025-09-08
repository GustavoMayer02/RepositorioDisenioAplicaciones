package da.ejercicio.usuarios;

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

    public long calcularMinutosAcceso() {
        if (this.entrada == null || this.salida == null || this.salida.before(entrada)) {
            return -1;
        } else {
            long duracionMS = this.salida.getTime() - this.entrada.getTime();
            return duracionMS / (60 * 1000);
        }
    }
}

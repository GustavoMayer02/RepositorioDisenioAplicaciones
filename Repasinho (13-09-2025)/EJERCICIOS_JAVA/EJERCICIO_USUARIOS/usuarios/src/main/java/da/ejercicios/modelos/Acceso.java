package da.ejercicios.modelos;

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

    public long obtenerDuracionAcceso() {
        if (entrada == null || salida == null || salida.before(entrada)) {
            return 0;
        } else {
            long diferenciaMS = salida.getTime() - entrada.getTime();
            return diferenciaMS / (60 * 1000);
        }

    }
}

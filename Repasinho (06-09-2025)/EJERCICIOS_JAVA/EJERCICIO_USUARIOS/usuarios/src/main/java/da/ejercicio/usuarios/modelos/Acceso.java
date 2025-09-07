package da.ejercicio.usuarios.modelos;

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

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public long calcularAccesoMinutos() {
        if (entrada == null || salida == null || salida.before(entrada)) {
            return 0;
        }
        long diferenciaMS = salida.getTime() - entrada.getTime();
        return diferenciaMS / (60 * 1000);

    }
}

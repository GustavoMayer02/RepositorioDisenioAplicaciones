package da.ejercicios.usuarios.modelos;

import java.util.Date;

public class Acceso {
    private Date entrada;
    private Date salida;

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

    public long obtenerMinutosAcceso() {
        if (this.entrada == null || this.salida == null || this.entrada.before(this.salida)) {
            return 0;
        } else {
            long diferenciaMS = this.salida.getTime() - this.entrada.getTime();
            return diferenciaMS / (60 * 1000);
        }
    }
}

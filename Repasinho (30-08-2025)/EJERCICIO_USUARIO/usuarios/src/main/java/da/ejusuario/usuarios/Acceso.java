package da.ejusuario.usuarios;

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

    public Long getDuracionEnMinutos() {
        if (this.entrada != null && this.salida != null && this.entrada.before(this.salida)) {
            long diferenciaMs = this.salida.getTime() - this.entrada.getTime();
            return diferenciaMs / 60000L;
        } else {
            return 0L;
        }
    }
}

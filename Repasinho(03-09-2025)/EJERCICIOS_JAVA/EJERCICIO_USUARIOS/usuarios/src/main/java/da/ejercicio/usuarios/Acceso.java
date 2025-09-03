package da.ejercicio.usuarios;

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

    public long calcularDiferenciaMinutos() {
        if (entrada == null || salida == null || entrada.after(salida)) {
            return -1;
        } else {
            return salida.getTime() - entrada.getTime() / (60 * 1000);
        }
    }
}

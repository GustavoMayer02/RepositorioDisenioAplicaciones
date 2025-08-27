package usuarios.da.ejercicioUsuarios.modelos;

import java.util.Date;

public class Acceso {
    private Date entrada;
    private Date salida;

    public Acceso(Date entrada, Date salida) {
        this.entrada = entrada;
        this.salida = salida;
    }

    public long getDuracionEntrada() {
        if (entrada == null || salida == null || salida.before(entrada)) {
            return 0;
        }

        long diferenciaMS = salida.getTime() - entrada.getTime();
        return diferenciaMS / (60 * 1000);
    }

    public Date getEntrada() {
        return entrada;
    }

    public Date getSalida() {
        return salida;
    }

}

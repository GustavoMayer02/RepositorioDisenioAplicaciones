package da.mvc.Contador.modelo;

public class Contador {
    private int valor;

    public void sumar() {
        valor++;
    }

    public boolean restar() {
        if (valor > 0) {
            valor--;
            return true;
        } else {
            return false;
        }
    }

    public int getValor() {
        return valor;
    }
}

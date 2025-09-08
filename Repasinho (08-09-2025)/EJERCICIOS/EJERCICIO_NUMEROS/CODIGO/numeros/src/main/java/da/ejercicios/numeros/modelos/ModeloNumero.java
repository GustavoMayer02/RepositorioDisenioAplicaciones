package da.ejercicios.numeros.modelos;

import java.util.ArrayList;
import java.util.List;

public class ModeloNumero {
    private int cantidad;
    private List<Integer> todos;
    private List<Integer> impares;
    private List<Integer> pares;

    public ModeloNumero() {
    }

    public int getCantidadRestante() {
        return cantidad;
    }

    public boolean iniciar(int cantidad) {
        if (cantidad > 0) {

            this.cantidad = cantidad;
            todos = new ArrayList<>();
            pares = new ArrayList<>();
            impares = new ArrayList<>();
            return true;
        }

        return false;
    }

    public boolean ingresar(int numero) {
        if (getCantidadRestante() == 0) {
            return false;
        } else {
            cantidad--;
            // PARSEAMOS EL NÚMERO INGRESADO PARA QUE EL MÉTODO ADD NO LO HAGA
            // AUTOMÁTICAMENTE POR ATRÁS.
            Integer numeroEntero = Integer.valueOf(numero);
            todos.add(numeroEntero);

            if (numeroEntero % 2 == 0) {
                pares.add(numeroEntero);
            } else {
                impares.add(numeroEntero);
            }

            return true;
        }
    }

    public boolean ingresoFinalizado() {
        return getCantidadRestante() == 0 && todos != null;
    }

    public List<Integer> obtenerResultado() {
        if (ingresoFinalizado()) {
            List<Integer> resultado = todos;

            if (pares.size() > impares.size()) {
                resultado = pares;
            } else if (impares.size() > pares.size()) {
                resultado = impares;
            }

            return resultado;
        } else {
            return null;
        }
    }
}

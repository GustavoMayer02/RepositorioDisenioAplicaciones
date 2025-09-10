package da.ejercicios.numeros.modelos;

import java.util.ArrayList;
import java.util.List;

public class ModeloNumeros {
    private int cantidad;
    private List<Integer> todos;
    private List<Integer> impares;
    private List<Integer> pares;

    public int getCantidadRestante() {
        return cantidad;
    }

    public boolean iniciar(int cantidad) {
        if (cantidad < 0) {
            return false;
        } else {
            this.cantidad = cantidad;
            this.todos = new ArrayList<Integer>();
            this.impares = new ArrayList<Integer>();
            this.pares = new ArrayList<Integer>();

            return true;
        }
    }

    public boolean ingresoFinalizado() {
        return getCantidadRestante() == 0 && todos != null;
    }

    public boolean agregar(int numero) {
        if (ingresoFinalizado()) {
            return false;
        } else {
            cantidad--;
            // PARSEAMOS EL VALOR INGRESADO A UN OBJETO DE TIPO INTEGER PARA QUE EL .ADD NO
            // TENGA QUE REALIZAR LA CONVERSIÓN POR ATRÁS.
            Integer nEntero = Integer.valueOf(numero);
            todos.add(nEntero);

            if (nEntero % 2 == 0) {
                pares.add(nEntero);
            } else {
                impares.add(nEntero);
            }

            return true;
        }
    }

    public List<Integer> obtenerResultado() {
        if (ingresoFinalizado()) {
            List<Integer> resultado = todos;

            if (impares.size() > pares.size()) {
                resultado = impares;
            } else if (pares.size() > impares.size()) {
                resultado = pares;
            }

            return resultado;
        } else {
            return null;
        }
    }
}

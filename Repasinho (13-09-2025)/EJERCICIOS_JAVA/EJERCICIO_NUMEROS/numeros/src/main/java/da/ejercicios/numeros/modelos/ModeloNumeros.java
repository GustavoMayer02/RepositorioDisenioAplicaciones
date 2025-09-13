package da.ejercicios.numeros.modelos;

import java.util.ArrayList;
import java.util.List;

public class ModeloNumeros {
    private List<Integer> todos;
    private List<Integer> impares;
    private List<Integer> pares;
    private int cantidad;

    public int getCantidadRestante() {
        return cantidad;
    }

    public boolean iniciar(int cantidad) {
        if (cantidad < 0) {
            return false;
        } else {
            todos = new ArrayList<Integer>();
            impares = new ArrayList<Integer>();
            pares = new ArrayList<Integer>();
            this.cantidad = cantidad;
            return true;
        }
    }

    public boolean ingresar(int numero) {
        if (ingresoFinalizado()) {
            return false;
        } else {
            if (numero < 0) {
                return false;
            } else {
                cantidad--;
                // MAPEAMOS EL ENTERO INGRESADO A UN OBJETO INTEGER PARA QUE NO SE HAGA DICHO
                // MAPEO POR ATRÁS CADA VEZ QUE EJECUTAMOS EL ADD.
                Integer entero = Integer.valueOf(numero);

                todos.add(entero);
                if (entero % 2 == 0) {
                    pares.add(entero);
                } else {
                    impares.add(entero);
                }

                return true;
            }
        }
    }

    public boolean ingresoFinalizado() {
        return getCantidadRestante() == 0 && todos != null;
    }

    public List<Integer> obtenerResultado() {
        if (ingresoFinalizado()) {
            List<Integer> resultado = new ArrayList<Integer>();

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

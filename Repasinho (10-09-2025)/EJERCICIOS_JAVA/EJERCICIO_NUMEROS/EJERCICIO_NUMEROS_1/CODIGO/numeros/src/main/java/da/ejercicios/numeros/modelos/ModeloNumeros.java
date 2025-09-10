package da.ejercicios.numeros.modelos;

import java.util.ArrayList;
import java.util.List;

public class ModeloNumeros {
    private int cantidad;
    private List<Integer> todos;
    private List<Integer> pares;
    private List<Integer> impares;

    public ModeloNumeros() {

    }

    public int getCantidadRestante() {
        return cantidad;
    }

    public boolean iniciar(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
            todos = new ArrayList<Integer>();
            pares = new ArrayList<Integer>();
            impares = new ArrayList<Integer>();
            return true;
        }

        return false;
    }

    public boolean ingresar(int numero) {
        if (getCantidadRestante() == 0) {
            return false;
        } else {
            cantidad--;
            // PARSEAMOS EL ENTERO COMO UN OBJETO DE TIPO INTEGER PARA QUE NO SE HAGA ESTE
            // PROCESO CADA VEZ QUE HACEMOS UN .ADD.
            Integer nObjeto = Integer.valueOf(numero);
            todos.add(nObjeto);
            if (nObjeto % 2 == 0) {
                pares.add(nObjeto);
            } else {
                impares.add(nObjeto);
            }

            return true;
        }
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
        }

        return null;
    }

    public boolean ingresoFinalizado() {
        return getCantidadRestante() == 0;
    }
}

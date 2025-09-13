package da.ejercicios.numeros.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import da.ejercicios.numeros.Respuesta;
import da.ejercicios.numeros.modelos.ModeloNumeros;

@RestController
@RequestMapping("/numeros")
public class NumerosController {
    private ModeloNumeros modelo = new ModeloNumeros();

    @PostMapping("/vistaConectada")
    public List<Respuesta> vistaConectada() {
        return Respuesta.lista(cuantosFaltan());
    }

    @PostMapping("/iniciar")
    public List<Respuesta> iniciar(int cantidad) {
        if (!modelo.iniciar(cantidad)) {
            return Respuesta.lista(error("No se pudo iniciar el proceso."));
        } else {
            return Respuesta.lista(cuantosFaltan(), mensaje("Proceso iniciado exitosamente."));
        }
    }

    @PostMapping("/agregar")
    public List<Respuesta> agregar(int numero) {
        if (!modelo.ingresar(numero)) {
            return Respuesta.lista(error("No se pudo agregar el número ingresado."));
        } else {
            if (modelo.ingresoFinalizado()) {
                return Respuesta.lista(mensaje("Proceso finalizado."), obtenerResultado());

            } else {
                return Respuesta.lista(mensaje("Número agregado exitosamente."), cuantosFaltan());

            }
        }
    }

    public Respuesta mensaje(String texto) {
        return new Respuesta("mensaje", texto);
    }

    public Respuesta error(String error) {
        return new Respuesta("mensaje", error);
    }

    public Respuesta cuantosFaltan() {
        return new Respuesta("faltan", modelo.getCantidadRestante());
    }

    public Respuesta obtenerResultado() {
        return new Respuesta("resultado", modelo.obtenerResultado());
    }
}

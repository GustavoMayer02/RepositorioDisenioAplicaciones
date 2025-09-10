package da.ejercicios.numeros.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public List<Respuesta> iniciar(@RequestParam int cantidad) {
        if (modelo.iniciar(cantidad)) {

            return Respuesta.lista(cuantosFaltan(), mensaje("Proceso iniciado exitosamente."));
        } else {
            return Respuesta.lista(error("No se pudo iniciar el proceso."));
        }
    }

    @PostMapping("/agregar")
    public List<Respuesta> agregar(@RequestParam int numero) {
        if (!modelo.agregar(numero)) {
            return Respuesta.lista(error("No se pudo agregar el número ingresado."));
        } else {
            if (modelo.ingresoFinalizado()) {
                return Respuesta.lista(resultado(), mensaje("Proceso finalizado."));
            } else {
                return Respuesta.lista(mensaje("Número agregado exitosamente."), cuantosFaltan());
            }
        }
    }

    public Respuesta mensaje(String texto) {
        return new Respuesta("mensaje", texto);
    }

    public Respuesta error(String texto) {
        return new Respuesta("error", texto);
    }

    public Respuesta resultado() {
        return new Respuesta("resultado", modelo.obtenerResultado());
    }

    public Respuesta cuantosFaltan() {
        return new Respuesta("faltan", modelo.getCantidadRestante());
    }
}

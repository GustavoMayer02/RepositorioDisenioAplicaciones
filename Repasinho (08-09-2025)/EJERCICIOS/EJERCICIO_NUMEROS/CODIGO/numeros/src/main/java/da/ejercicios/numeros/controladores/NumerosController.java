package da.ejercicios.numeros.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import da.ejercicios.numeros.Respuesta;
import da.ejercicios.numeros.modelos.ModeloNumero;

@RestController
@RequestMapping("/numeros")
public class NumerosController {
    ModeloNumero modelo = new ModeloNumero();

    @PostMapping("/vistaConectada")
    public List<Respuesta> conectarVista() {
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
    public List<Respuesta> agregarNumero(@RequestParam int numero) {
        if (modelo.ingresar(numero)) {
            if (modelo.ingresoFinalizado()) {
                return Respuesta.lista(resultado(), mensaje("Proceso finalizado"));
            }

            return Respuesta.lista(cuantosFaltan());
        } else {

            return Respuesta.lista(error("No se pudo agregar el número."));
        }
    }

    public Respuesta resultado() {
        return new Respuesta("resultado", modelo.obtenerResultado());
    }

    public Respuesta cuantosFaltan() {
        return new Respuesta("faltan", modelo.getCantidadRestante());
    }

    public Respuesta mensaje(String texto) {
        return new Respuesta("mensaje", texto);
    }

    public Respuesta error(String error) {
        return new Respuesta("error", error);
    }
}

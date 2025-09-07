package da.mvc.Contador.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import da.mvc.Contador.Respuesta;
import da.mvc.Contador.modelo.Contador;

@RestController
@RequestMapping("/contador")
public class ContadorController {

    // REFERENCIAMOS EL MODELO.
    private Contador contador = new Contador();

    @PostMapping("/inicializarVista")
    public List<Respuesta> inicializarVista() {
        return Respuesta.lista(valorContador());
    }

    @PostMapping("/sumar")
    public List<Respuesta> sumar() {
        contador.sumar();
        List<Respuesta> respuestas = new ArrayList<>();

        respuestas.add(valorContador());

        if (esMultiploDe3(contador.getValor())) {
            respuestas.add(mensaje("Es múltiplo de 3."));
        }

        return respuestas;
    }

    @PostMapping("/restar")
    public List<Respuesta> restar() {
        List<Respuesta> respuestas = new ArrayList<>();

        if (contador.restar()) {
            if (esMultiploDe3(contador.getValor())) {
                respuestas.add(mensaje("Es múltiplo de 3."));
            }
            respuestas.add(valorContador());
        } else {
            return Respuesta.lista(mensaje("No es posible restar"));
        }

        return respuestas;
    }

    private boolean esMultiploDe3(int valor) {
        return valor % 3 == 0;
    }

    private Respuesta mensaje(String texto) {
        return new Respuesta("mensaje", texto);
    }

    private Respuesta valorContador() {
        return new Respuesta("valor", contador.getValor());
    }
}

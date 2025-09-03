package da.ejemplo.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/holamundo")
public class HolaMundoController {

    @GetMapping("/saludar")
    public String saludar() {
        return "¡Hola mundo con SPRING BOOT!";
    }
}

package ort.da.holaMundo.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/holamundo")
public class HolaMundoController {

    @GetMapping("/saludar")
    public String saludar() {
        return "¡Bom dia World utilizando SPRINGBOOT!";
    }
}

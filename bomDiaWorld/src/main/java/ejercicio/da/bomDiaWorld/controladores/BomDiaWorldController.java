package ejercicio.da.bomDiaWorld.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bomDiaWorld")

public class BomDiaWorldController {

    @GetMapping("/saludar")
    public String saludar() {
        return "¡Bom dia world!";
    }
}
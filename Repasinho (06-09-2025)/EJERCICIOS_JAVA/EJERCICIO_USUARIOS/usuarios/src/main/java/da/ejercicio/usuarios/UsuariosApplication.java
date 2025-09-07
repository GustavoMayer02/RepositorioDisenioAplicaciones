package da.ejercicio.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import da.ejercicio.usuarios.modelos.ServiciosUsuarios;

@SpringBootApplication
public class UsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuariosApplication.class, args);
		DatosDePrueba.cargar(ServiciosUsuarios.getInstancia());
	}

}

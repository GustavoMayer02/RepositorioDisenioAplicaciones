package da.ejercicios.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import da.ejercicios.usuarios.modelos.ServiciosUsuario;

@SpringBootApplication
public class UsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuariosApplication.class, args);
		DatosDePrueba.cargar(ServiciosUsuario.getInstancia());
	}

}

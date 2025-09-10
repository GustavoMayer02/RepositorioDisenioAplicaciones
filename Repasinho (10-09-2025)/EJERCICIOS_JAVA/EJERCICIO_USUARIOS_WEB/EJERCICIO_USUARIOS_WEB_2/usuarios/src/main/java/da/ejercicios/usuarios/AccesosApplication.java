package da.ejercicios.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import da.ejercicios.usuarios.modelos.DatosDePrueba;
import da.ejercicios.usuarios.modelos.ServiciosUsuario;

@SpringBootApplication
public class AccesosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccesosApplication.class, args);
		DatosDePrueba.cargar(ServiciosUsuario.getInstancia());
	}

}

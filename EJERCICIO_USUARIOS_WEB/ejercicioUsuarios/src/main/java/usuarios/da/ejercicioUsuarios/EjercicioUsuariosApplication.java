package usuarios.da.ejercicioUsuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import usuarios.da.ejercicioUsuarios.precargas.DatosDePrueba;
import usuarios.da.ejercicioUsuarios.servicios.ServiciosUsuario;

@SpringBootApplication(scanBasePackages = "usuarios.da.ejercicioUsuarios")
public class EjercicioUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioUsuariosApplication.class, args);
		DatosDePrueba.cargar(ServiciosUsuario.getInstancia());
	}

}

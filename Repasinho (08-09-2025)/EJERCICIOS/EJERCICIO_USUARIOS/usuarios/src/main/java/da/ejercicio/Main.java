package da.ejercicio;

import java.util.List;

import da.ejercicio.usuarios.ServiciosUsuario;
import da.ejercicio.usuarios.Usuario;

public class Main {
    public static void main(String[] args) {

        System.out.println("Cargando datos de prueba...");

        ServiciosUsuario servicio = new ServiciosUsuario();

        DatosDePrueba.cargar(servicio);

        System.out.println("Datos de prueba cargados exitosamente!");

        System.out.println("Se han creado 10 usuarios con accesos variados.");

        int tiempoM = 300;

        System.out
                .println("Ejecutando consulta de usuarios habilitados que han accedido mas de " + tiempoM + " minutos");

        List<Usuario> resultado = servicio.obtenerUsuariosConMasMinutosQue(tiempoM);

        System.out.println("\nTotal " + resultado.size() + " usuarios: \n");

        for (Usuario u : resultado) {
            System.out.println(u.toString() + " - " + u.calcularDuracionAcceso() + " minutos.");
        }
    }
}
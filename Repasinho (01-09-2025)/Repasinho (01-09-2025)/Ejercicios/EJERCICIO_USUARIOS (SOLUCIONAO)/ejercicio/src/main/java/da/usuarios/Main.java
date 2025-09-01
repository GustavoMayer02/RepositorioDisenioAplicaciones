package da.usuarios;

import java.util.List;

import da.usuarios.modelos.ServiciosUsuario;
import da.usuarios.modelos.Usuario;

public class Main {
    public static void main(String[] args) {

        System.out.println("Cargando datos de prueba...");

        ServiciosUsuario servicio = new ServiciosUsuario();

        DatosDePrueba.cargar(servicio);

        System.out.println("Datos de prueba cargados exitosamente!");

        System.out.println("Se han creado 10 usuarios con accesos variados.");

        int tiempoM = 166;

        System.out
                .println("Ejecutando consulta de usuarios habilitados que han accedido mas de " + tiempoM + " minutos");

        List<Usuario> resultado = servicio.getUsuariosConMasDuracionQue(tiempoM);

        System.out.println("\nTotal " + resultado.size() + " usuarios: \n");

        for (Usuario u : resultado) {
            System.out.println(u.toString() + " - " + u.obtenerDuracionTotalAcceso() + " minutos.");
        }
    }
}
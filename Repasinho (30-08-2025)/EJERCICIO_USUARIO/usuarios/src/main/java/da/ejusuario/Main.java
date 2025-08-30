package da.ejusuario;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

import da.ejusuario.usuarios.ServiciosUsuario;
import da.ejusuario.usuarios.Usuario;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Cargando datos de prueba...");
        ServiciosUsuario servicio = new ServiciosUsuario();
        DatosDePrueba.cargar(servicio);
        System.out.println("Datos de prueba cargados exitosamente!");
        System.out.println("Se han creado 10 usuarios con accesos variados.");
        int tiempoM = 160;
        System.out
                .println("Ejecutando consulta de usuarios habilitados que han accedido mas de " + tiempoM + " minutos");
        List<Usuario> resultado = servicio.getUsuariosAccesoMasMintuos(tiempoM);
        System.out.println("\nTotal " + resultado.size() + " usuarios: \n");
        Iterator var5 = resultado.iterator();

        while (var5.hasNext()) {
            Usuario u = (Usuario) var5.next();
            PrintStream var10000 = System.out;
            String var10001 = u.toString();
            var10000.println(var10001 + " - " + u.tiempoTotalAcceso() + " minutos.");
        }

    }
}

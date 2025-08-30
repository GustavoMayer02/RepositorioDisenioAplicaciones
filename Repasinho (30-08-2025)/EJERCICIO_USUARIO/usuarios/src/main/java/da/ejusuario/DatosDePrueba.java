package da.ejusuario;

import java.util.Date;

import da.ejusuario.usuarios.Acceso;
import da.ejusuario.usuarios.ServiciosUsuario;
import da.ejusuario.usuarios.Usuario;

public class DatosDePrueba {
    public DatosDePrueba() {
    }

    public static void cargar(ServiciosUsuario servicio) {
        Usuario isabel = new Usuario("imoreno", "Isabel", "Moreno", true);
        isabel.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000L),
                new Date(System.currentTimeMillis() - 86400000L + 2100000L)));
        servicio.agregarUsuario(isabel);
        Usuario carlos = new Usuario("crodriguez", "Carlos", "Rodríguez", true);
        carlos.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000L),
                new Date(System.currentTimeMillis() - 86400000L + 2700000L)));
        servicio.agregarUsuario(carlos);
        Usuario carmen = new Usuario("cruiz", "Carmen", "Ruiz", true);
        carmen.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000L),
                new Date(System.currentTimeMillis() - 86400000L + 3000000L)));
        carmen.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000L),
                new Date(System.currentTimeMillis() - 172800000L + 3600000L)));
        servicio.agregarUsuario(carmen);
        Usuario jose = new Usuario("jlopez", "José", "López", true);
        jose.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000L),
                new Date(System.currentTimeMillis() - 86400000L + 5400000L)));
        jose.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000L),
                new Date(System.currentTimeMillis() - 172800000L + 3600000L)));
        servicio.agregarUsuario(jose);
        Usuario miguel = new Usuario("msanchez", "Miguel", "Sánchez", true);
        miguel.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000L),
                new Date(System.currentTimeMillis() - 86400000L + 3300000L)));
        miguel.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000L),
                new Date(System.currentTimeMillis() - 172800000L + 3600000L)));
        miguel.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 259200000L),
                new Date(System.currentTimeMillis() - 259200000L + 3000000L)));
        servicio.agregarUsuario(miguel);
        Usuario maria = new Usuario("mgarcia", "María", "García", true);
        maria.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000L),
                new Date(System.currentTimeMillis() - 86400000L + 3600000L)));
        maria.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000L),
                new Date(System.currentTimeMillis() - 172800000L + 4500000L)));
        maria.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 259200000L),
                new Date(System.currentTimeMillis() - 259200000L + 3000000L)));
        servicio.agregarUsuario(maria);
        Usuario alejandro = new Usuario("atorres", "Alejandro", "Torres", true);
        alejandro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000L),
                new Date(System.currentTimeMillis() - 86400000L + 3600000L)));
        alejandro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000L),
                new Date(System.currentTimeMillis() - 172800000L + 3600000L)));
        alejandro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 259200000L),
                new Date(System.currentTimeMillis() - 259200000L + 3600000L)));
        alejandro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 345600000L),
                new Date(System.currentTimeMillis() - 345600000L + 3600000L)));
        servicio.agregarUsuario(alejandro);
        Usuario lucia = new Usuario("lmartinez", "Lucía", "Martínez", true);
        lucia.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000L),
                new Date(System.currentTimeMillis() - 86400000L + 4200000L)));
        lucia.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000L),
                new Date(System.currentTimeMillis() - 172800000L + 4800000L)));
        lucia.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 259200000L),
                new Date(System.currentTimeMillis() - 259200000L + 3600000L)));
        lucia.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 345600000L),
                new Date(System.currentTimeMillis() - 345600000L + 4200000L)));
        servicio.agregarUsuario(lucia);
        Usuario ana = new Usuario("afernandez", "Ana", "Fernández", true);
        ana.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000L),
                new Date(System.currentTimeMillis() - 86400000L + 3600000L)));
        ana.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000L),
                new Date(System.currentTimeMillis() - 172800000L + 4800000L)));
        ana.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 259200000L),
                new Date(System.currentTimeMillis() - 259200000L + 4200000L)));
        ana.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 345600000L),
                new Date(System.currentTimeMillis() - 345600000L + 3000000L)));
        ana.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 432000000L),
                new Date(System.currentTimeMillis() - 432000000L + 3600000L)));
        servicio.agregarUsuario(ana);
        Usuario pedro = new Usuario("pgonzalez", "Pedro", "González", true);
        pedro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000L),
                new Date(System.currentTimeMillis() - 86400000L + 4800000L)));
        pedro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000L),
                new Date(System.currentTimeMillis() - 172800000L + 4500000L)));
        pedro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 259200000L),
                new Date(System.currentTimeMillis() - 259200000L + 4200000L)));
        pedro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 345600000L),
                new Date(System.currentTimeMillis() - 345600000L + 5400000L)));
        pedro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 432000000L),
                new Date(System.currentTimeMillis() - 432000000L + 3600000L)));
        servicio.agregarUsuario(pedro);
    }
}

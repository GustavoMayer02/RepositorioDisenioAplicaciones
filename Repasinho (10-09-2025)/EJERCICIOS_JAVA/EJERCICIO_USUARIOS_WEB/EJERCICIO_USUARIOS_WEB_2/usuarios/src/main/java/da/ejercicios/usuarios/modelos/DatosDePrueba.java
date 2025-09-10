package da.ejercicios.usuarios.modelos;

import java.util.Date;

public class DatosDePrueba {
        /**
         * Carga datos de prueba de usuarios ordenados por tiempo total de acceso (de
         * menor a mayor).
         * 
         * @param servicio Servicio donde se cargarán los usuarios
         */
        public static void cargar(ServiciosUsuario servicio) {

                // Usuario 1: Isabel Moreno - 1 acceso - Total: 35 minutos
                Usuario isabel = new Usuario("imoreno", "Isabel", "Moreno", true);
                isabel.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000),
                                new Date(System.currentTimeMillis() - 86400000 + 2100000))); // 35 min
                servicio.agregarUsuario(isabel);

                // Usuario 2: Carlos Rodríguez - 1 acceso - Total: 45 minutos
                Usuario carlos = new Usuario("crodriguez", "Carlos", "Rodríguez", true);
                carlos.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000),
                                new Date(System.currentTimeMillis() - 86400000 + 2700000))); // 45 min
                servicio.agregarUsuario(carlos);

                // Usuario 3: Carmen Ruiz - 2 accesos - Total: 110 minutos
                Usuario carmen = new Usuario("cruiz", "Carmen", "Ruiz", true);
                carmen.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000),
                                new Date(System.currentTimeMillis() - 86400000 + 3000000))); // 50 min
                carmen.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000),
                                new Date(System.currentTimeMillis() - 172800000 + 3600000))); // 60 min
                servicio.agregarUsuario(carmen);

                // Usuario 4: José López - 2 accesos - Total: 150 minutos
                Usuario jose = new Usuario("jlopez", "José", "López", true);
                jose.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000),
                                new Date(System.currentTimeMillis() - 86400000 + 5400000))); // 90 min
                jose.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000),
                                new Date(System.currentTimeMillis() - 172800000 + 3600000))); // 60 min
                servicio.agregarUsuario(jose);

                // Usuario 5: Miguel Sánchez - 3 accesos - Total: 165 minutos
                Usuario miguel = new Usuario("msanchez", "Miguel", "Sánchez", true);
                miguel.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000),
                                new Date(System.currentTimeMillis() - 86400000 + 3300000))); // 55 min
                miguel.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000),
                                new Date(System.currentTimeMillis() - 172800000 + 3600000))); // 60 min
                miguel.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 259200000),
                                new Date(System.currentTimeMillis() - 259200000 + 3000000))); // 50 min
                servicio.agregarUsuario(miguel);

                // Usuario 6: María García - 3 accesos - Total: 185 minutos
                Usuario maria = new Usuario("mgarcia", "María", "García", true);
                maria.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000),
                                new Date(System.currentTimeMillis() - 86400000 + 3600000))); // 60 min
                maria.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000),
                                new Date(System.currentTimeMillis() - 172800000 + 4500000))); // 75 min
                maria.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 259200000),
                                new Date(System.currentTimeMillis() - 259200000 + 3000000))); // 50 min
                servicio.agregarUsuario(maria);

                // Usuario 7: Alejandro Torres - 4 accesos - Total: 240 minutos
                Usuario alejandro = new Usuario("atorres", "Alejandro", "Torres", true);
                alejandro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000),
                                new Date(System.currentTimeMillis() - 86400000 + 3600000))); // 60 min
                alejandro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000),
                                new Date(System.currentTimeMillis() - 172800000 + 3600000))); // 60 min
                alejandro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 259200000),
                                new Date(System.currentTimeMillis() - 259200000 + 3600000))); // 60 min
                alejandro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 345600000),
                                new Date(System.currentTimeMillis() - 345600000 + 3600000))); // 60 min
                servicio.agregarUsuario(alejandro);

                // Usuario 8: Lucía Martínez - 4 accesos - Total: 280 minutos
                Usuario lucia = new Usuario("lmartinez", "Lucía", "Martínez", true);
                lucia.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000),
                                new Date(System.currentTimeMillis() - 86400000 + 4200000))); // 70 min
                lucia.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000),
                                new Date(System.currentTimeMillis() - 172800000 + 4800000))); // 80 min
                lucia.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 259200000),
                                new Date(System.currentTimeMillis() - 259200000 + 3600000))); // 60 min
                lucia.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 345600000),
                                new Date(System.currentTimeMillis() - 345600000 + 4200000))); // 70 min
                servicio.agregarUsuario(lucia);

                // Usuario 9: Ana Fernández - 5 accesos - Total: 320 minutos
                Usuario ana = new Usuario("afernandez", "Ana", "Fernández", true);
                ana.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000),
                                new Date(System.currentTimeMillis() - 86400000 + 3600000))); // 60 min
                ana.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000),
                                new Date(System.currentTimeMillis() - 172800000 + 4800000))); // 80 min
                ana.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 259200000),
                                new Date(System.currentTimeMillis() - 259200000 + 4200000))); // 70 min
                ana.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 345600000),
                                new Date(System.currentTimeMillis() - 345600000 + 3000000))); // 50 min
                ana.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 432000000),
                                new Date(System.currentTimeMillis() - 432000000 + 3600000))); // 60 min
                servicio.agregarUsuario(ana);

                // Usuario 10: Pedro González - 5 accesos - Total: 375 minutos
                Usuario pedro = new Usuario("pgonzalez", "Pedro", "González", true);
                pedro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 86400000),
                                new Date(System.currentTimeMillis() - 86400000 + 4800000))); // 80 min
                pedro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 172800000),
                                new Date(System.currentTimeMillis() - 172800000 + 4500000))); // 75 min
                pedro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 259200000),
                                new Date(System.currentTimeMillis() - 259200000 + 4200000))); // 70 min
                pedro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 345600000),
                                new Date(System.currentTimeMillis() - 345600000 + 5400000))); // 90 min
                pedro.agregarAcceso(new Acceso(new Date(System.currentTimeMillis() - 432000000),
                                new Date(System.currentTimeMillis() - 432000000 + 3600000))); // 60 min
                servicio.agregarUsuario(pedro);
        }

}

package ort.da.experto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ort.da.facturas.modelo.DatosPrueba;

@SpringBootApplication
public class ExpertoApplication {

    public static void main(String[] args) {
        DatosPrueba.cargar();
        SpringApplication.run(ExpertoApplication.class, args);
    }

}

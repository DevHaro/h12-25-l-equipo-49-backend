package com.churninsight.h12_25_l_equipo_49_backend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Anotación principal de Spring Boot
// Indica que esta clase: Es la configucación principal , habilita el escaneo de componente,
// permite arrancar la aplicacion
@SpringBootApplication
public class H1225LEquipo49BackendApplication {

    //Método main: Punto de entrada de aplicación

    public static void main(String[] args) {

        //Inicia la aplicacion Spring Boot, levanta el servidor embebido (tomcat)
        SpringApplication.run(H1225LEquipo49BackendApplication.class, args);
    }

}

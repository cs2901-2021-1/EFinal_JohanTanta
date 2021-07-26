package cs.lab;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Demo {
    static final Logger logger = Logger.getLogger(Demo.class.getName());
    public static void main(String[] args) throws IOException {
        Aplicacion instance = Aplicacion.getInstance();

        Usuario usuario = new Usuario();
        Scanner input = new Scanner(System.in);
        usuario.setUsername(input.nextLine());
        usuario.setPassword(input.nextLine());

        CentroDeVacunacion centro1 = new CentroDeVacunacion();
        CentroDeVacunacion centro2 = new CentroDeVacunacion();
        centro1.setId(100);
        centro2.setId(101);

        instance.agregarCentroDeVacunacion(centro1);
        instance.agregarCentroDeVacunacion(centro2);

        instance.login(usuario);

        if(usuario.getLogeado()) {
            logger.info("Logeado correctamente");
        }else{
            logger.info("Login invalido");
        }
        logger.info("Dar de alta al centro1 con id: " + 100);
        instance.darDeAlta(usuario, centro1.getId());

        logger.info("Se vacuna un nueva persona en el centro1 con dni: 72789412");
        PersonaVacunada personaVacunada = new PersonaVacunada("Johan", "Tanta", 21, "72789412");
        centro1.agregarPersonaVacunada(personaVacunada);



    }

}
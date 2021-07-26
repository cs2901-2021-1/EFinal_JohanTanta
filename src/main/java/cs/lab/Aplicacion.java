package cs.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Aplicacion {
    static final Logger logger = Logger.getLogger(Aplicacion.class.getName());
    private static Aplicacion instance = null;
    List<CentroDeVacunacion> centrosDeVacunacion;
    Boolean login;
    private Aplicacion () {
        centrosDeVacunacion = new ArrayList<>();
    }

    public static synchronized Aplicacion getInstance(){
        if(instance == null){
            instance = new Aplicacion();
        }
        return instance;
    }

    public Boolean login(Usuario usuario){
        String username = usuario.getUsername();
        String password = usuario.getPassword();
        if(username.length() != password.length()) {
            return false;
        }
        int size = username.length();
        for(int i = 0; i < username.length(); ++i){
            if(username.charAt(i) != password.charAt(size - i - 1)){
                return false;
            }
        }
        return true;
    }

    public List<CentroDeVacunacion> getCentrosDeVacunacion() {
        return centrosDeVacunacion;
    }

    public void agregarCentroDeVacunacion(CentroDeVacunacion centroDeVacunacion){
        centrosDeVacunacion.add(centroDeVacunacion);
    }

    public int getCantidadCentrosDeVacunacion(){
        return centrosDeVacunacion.size();
    }

    public void notificar(int idCentroDeVacunacion, PersonaVacunada personaVacunada){
        logger.info("Nueva persona vacunada");
        logger.info("DNI de la persona vacunada: " + personaVacunada.getDni());
        logger.info("En el centro de vacunacion con ID: " + idCentroDeVacunacion);
    }

}

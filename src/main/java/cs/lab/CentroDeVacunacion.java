package cs.lab;

import java.util.ArrayList;
import java.util.List;

public class CentroDeVacunacion {
    private Integer id;
    List<PersonaVacunada> personasVacunadas;

    void agregarPersonaVacunada(PersonaVacunada personaVacunada){
        personasVacunadas.add(personaVacunada);
        Aplicacion.getInstance().notificar(id, personaVacunada);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<PersonaVacunada> getPersonasVacunadas() {
        return personasVacunadas;
    }

    public void setPersonasVacunadas(List<PersonaVacunada> personasVacunadas) {
        this.personasVacunadas = personasVacunadas;
    }
}

package cs.lab;

import java.util.ArrayList;
import java.util.List;

public class CentroDeVacunacion {
    private int id;
    List<PersonaVacunada> personasVacunadas;
    Boolean darDeAlta;
    public CentroDeVacunacion(){
        this.personasVacunadas = new ArrayList<>();
        this.darDeAlta = false;
    }

    public CentroDeVacunacion(Integer id){
        this.id = id;
        this.personasVacunadas = new ArrayList<>();
        this.darDeAlta = false;
    }

    void agregarPersonaVacunada(PersonaVacunada personaVacunada){
        this.personasVacunadas.add(personaVacunada);
        if(getDarDeAlta()) {
            Aplicacion.getInstance().notificar(this, personaVacunada);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<PersonaVacunada> getPersonasVacunadas() {
        return personasVacunadas;
    }

    public void setPersonasVacunadas(List<PersonaVacunada> personasVacunadas) {
        this.personasVacunadas = personasVacunadas;
    }

    public Boolean getDarDeAlta() {
        return darDeAlta;
    }

    public void setDarDeAlta(Boolean darDeAlta) {
        this.darDeAlta = darDeAlta;
    }
}

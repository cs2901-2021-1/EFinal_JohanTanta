package cs.lab;

public class PersonaVacunada {
    private String nombres;
    private String apellidos;
    private Integer edades;
    private String dni;

    PersonaVacunada(){
        
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdades() {
        return edades;
    }

    public void setEdades(Integer edades) {
        this.edades = edades;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}

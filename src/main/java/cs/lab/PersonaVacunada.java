package cs.lab;

public class PersonaVacunada {
    private String Nombres;
    private String Apellidos;
    private Integer Edades;
    private String Dni;

    PersonaVacunada(){
        
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public Integer getEdades() {
        return Edades;
    }

    public void setEdades(Integer edades) {
        Edades = edades;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }
}

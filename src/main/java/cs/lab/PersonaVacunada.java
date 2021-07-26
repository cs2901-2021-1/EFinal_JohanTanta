package cs.lab;

public class PersonaVacunada {
    private String nombres;
    private String apellidos;
    private int edad;
    private String dni;

    PersonaVacunada(){
        
    }

    public PersonaVacunada(String nombres, String apellidos, int edad, String dni) {
        this.setNombres(nombres);
        this.setApellidos(apellidos);
        this.setEdad(edad);
        this.setDni(dni);
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}

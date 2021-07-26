package cs.lab;

public class Usuario {
    private String username;
    private String password;
    Boolean logeado;

    public Usuario(){

    }

    public Usuario(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getLogeado() {
        return logeado;
    }

    public void setLogeado(Boolean logeado) {
        this.logeado = logeado;
    }
}

package cs.lab;

import java.util.Scanner;

public class Usuario {
    private String username;
    private String password;
    
    public Usuario(){

    }

    void ingresarDatos(){
        Scanner input = new Scanner(System.in);
        this.username = input.nextLine();
        this.username = input.nextLine();
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
}

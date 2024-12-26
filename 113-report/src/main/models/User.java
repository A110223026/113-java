package main.models;

import java.util.ArrayList;

public class User {
    protected String username;
    protected String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

}

public abstract void displayInfo();

public String getEmailDomain() {
    return email.substring(email.indexOf("@") + 1);
}

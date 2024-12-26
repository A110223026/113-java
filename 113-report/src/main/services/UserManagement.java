package main.services;

import main.models.User;
import java.util.ArrayList;

public class UserManagement {
    private ArrayList<User> users;

    public UserManagement() {
        this.users = new ArrayList<>();
}
    public void addUser(User user) {
        users.add(user);
        System.out.println("User " + user.username + " has been added.");
    }

    // 移除用戶
    public void removeUser(String username) {
        users.removeIf(user -> user.username.equals(username));
        System.out.println("User " + username + " has been removed.");
    }

    // 列出所有用戶
    public void listUsers() {
        System.out.println("Registered Users:");
        for (User user : users) {
            user.displayInfo();
        }
    }
}
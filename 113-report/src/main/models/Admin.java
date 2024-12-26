package main.models;

public class Admin extends User{
    private int adminLevel;

    public Admin(String username, String email) {
        super(username, email); // 呼叫父類別的建構子
        this.adminLevel = 1;
}

    public void setAdminLevel(int level) {
        this.adminLevel = level;
    }
    public int getAdminLevel() {
        return adminLevel;
    }

    // 覆寫抽象方法
    @Override
    public void displayInfo() {
        System.out.println("Admin Username: " + username + ", Email: " + email + ", Level: " + adminLevel);
    }
}
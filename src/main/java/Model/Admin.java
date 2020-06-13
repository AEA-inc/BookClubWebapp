package Model;

public class Admin {
    private int id;
    private String userName;
    private String password;
    private Role role;

    public Admin(int id, String userName, String password, Role role) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.role = Role.ADMIN;
    }
}

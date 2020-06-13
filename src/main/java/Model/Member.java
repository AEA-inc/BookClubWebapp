package Model;

public class Member {
    private int id;
    private String firstName;
    private String lastName;
    private String emailAdd;
    private Role role;

    public Member() {
        super();
    }

    public Member(int id, String firstName, String lastName, String emailAdd, Role role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAdd = emailAdd;
        this.role = Role.ADMIN;
    }
}


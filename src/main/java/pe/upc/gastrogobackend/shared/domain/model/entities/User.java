package pe.upc.gastrogobackend.shared.domain.model.entities;
/**
 * @summary Represents a user in the system.
 */
public class User {
    private String userId;
    private String dni;
    private String name;
    private String lastname;
    private String address;
    private String userType;
    private String email;
    private String password;

    public User(String userId, String dni, String name, String lastname, String address, String userType, String email, String password) {
        this.userId = userId;
        this.dni = dni;
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.userType = userType;
        this.email = email;
        this.password = password;
    }

    public void register() {
    }

    public void logIn() {
    }
}
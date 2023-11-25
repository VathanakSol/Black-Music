import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class User {
    private String username;
    private String email;
    private String password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

class RegistrationSystem {
    private Map<String, User> registeredUsers;

    public RegistrationSystem() {
        this.registeredUsers = new HashMap<>();
    }

    public void registerUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String username = scanner.nextLine();

        // Check if the username is already taken
        if (registeredUsers.containsKey(username)) {
            System.out.println("Username is already taken. Please choose another one.");
            return;
        }

        System.out.println("Enter your email: ");
        String email = scanner.nextLine();

        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        // Create a new user and add it to the registered users map
        User newUser = new User(username, email, password);
        registeredUsers.put(username, newUser);

        System.out.println("Registration successful for user: " + username);
    }

    public void displayRegisteredUsers() {
        System.out.println("Registered Users:");
        for (User user : registeredUsers.values()) {
            System.out.println(user);
        }
    }
}

public class myMusic {
    public static void main(String[] args) {
        RegistrationSystem registrationSystem = new RegistrationSystem();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many user do you want to input?"); int count = scanner.nextInt();
        // Example registration
        for(int i=0; i<count; i++){
            registrationSystem.registerUser();

            // Display registered users
            registrationSystem.displayRegisteredUsers();

        }

        // Close the scanner
        scanner.close();
    }
}

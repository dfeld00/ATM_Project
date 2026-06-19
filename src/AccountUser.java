import java.util.Scanner;

public class AccountUser {
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    AccountUser() {
        this.firstName = "No first name";
        this.lastName = "No last name";
        this.username = "No username";
        this.password = "No password";
    }

    public void setFirstName(Scanner scanner) {
        System.out.println("Enter first name:");
        this.firstName = scanner.nextLine();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(Scanner scanner) {
        System.out.println("Enter last name:");
        this.lastName = scanner.nextLine();
    }
    public String getLastName() {
        return lastName;
    }

    public  boolean usernameValidation (String username) {
        boolean isValidusername;

        if (username.length() >= 12 && username.length() <= 24) {
            isValidusername = true;
        }
        else {
            isValidusername = false;
        }

        return isValidusername;
    }

    public void setUsername(Scanner scanner) {
        boolean isValid = false;

        while(!isValid) {
            System.out.println("Enter a username 12-24 characters long:");
            String username = scanner.nextLine();

            if (usernameValidation(username)) {
                this.username = username;
                isValid = true;
            } else {
                System.out.println("Invalid username!");
                System.out.println("**************************************");
            }
        }
    }
}

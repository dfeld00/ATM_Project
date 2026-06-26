import java.util.Scanner;

public class AccountUser {
    private static int userId;
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    AccountUser() {
        this.firstName = "No first name";
        this.lastName = "No last name";
        this.username = "No username";
        this.password = "No password";
        ++userId;
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

    private boolean usernameValidation (String username) {
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
            String enterUsername = scanner.nextLine();

            if (usernameValidation(enterUsername)) {
                this.username = enterUsername;
                isValid = true;
            } else {
                System.out.println("Invalid username!");
                System.out.println("**************************************");
            }
        }
    }

    /*private boolean validatePassword(String password) { //FIXME CONTINUE DEVELOPING PASSWORD VALIDATION
        boolean isValid = false;
        final int MIN_PASSWORD_LENGTH = 12;
        char[] arrayPassword = password.toCharArray();

        return isValid; 
    }*/

    public void setPassword(Scanner scanner) {
        System.out.println("Enter a password: (Must be at least 12 characters long, contain only letters, numbers, or special characters including: !, _, @)");
        String userPassword = scanner.nextLine();

        if (validatePassword(userPassword)) {
            this.password = userPassword;
        }
        else {
            System.out.println("Invalid password!");
            System.out.println("**************************************");
        }
    }
}

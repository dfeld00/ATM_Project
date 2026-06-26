import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intInput;
        String stringInput;

        StartMenu.startUpPage();

        intInput = scanner.nextInt();
        scanner.nextLine();

        if (intInput == 2) {

            AccountUser user1 = new AccountUser();
            //user1.setFirstName(scanner); FIXME UNCOMMENT
            //user1.setLastName(scanner);   ****
            //user1.setUsername(scanner);   FIXME UNCOMMENT
            user1.setPassword(scanner);



        }
    }
}


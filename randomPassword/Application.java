package randomPassword;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        PasswordGenerator passwordGenerator = new PasswordGenerator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password length of 8 to 12 characters ");
        int lengthPassword = scanner.nextInt();

        if (lengthPassword >= 8 && lengthPassword <= 12) {
            String password = passwordGenerator.generatePassword(lengthPassword);
            System.out.println("Generated password " + password);
        } else {
            System.out.println("Password length should be 8 to 12 characters long ");
        }
        scanner.close();
    }
}

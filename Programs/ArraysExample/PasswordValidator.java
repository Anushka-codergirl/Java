import java.util.Scanner;

public class PasswordValidator {

    // Method to check if the password is valid
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false; 
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // Iterate over each character in the password
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (c >= 33 && c <= 46 || c == 64) {
                hasSpecialChar = true;
            }
        }
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password to validate: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid. Make sure it contains at least 8 characters, one uppercase letter, one lowercase letter, one digit, and one special character.");
        }
        scanner.close();
    }
    
}

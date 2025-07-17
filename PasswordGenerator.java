import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Character> generatedPassword = new ArrayList<Character>();

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String symbols = "!@#$%^&*_-+=<>?";
        String allChars = upper + lower + digits + symbols;

        System.out.print("Enter desired password length (min 6): ");
        int length = scanner.nextInt();

        if (length < 6) {
            System.out.println("Password length must be greater than 5.");
        }
        else {
            generatedPassword.add(upper.charAt(random.nextInt(upper.length())));
            generatedPassword.add(lower.charAt(random.nextInt(lower.length())));
            generatedPassword.add(digits.charAt(random.nextInt(digits.length())));
            generatedPassword.add(symbols.charAt(random.nextInt(symbols.length())));
            generatedPassword.add(allChars.charAt(random.nextInt(allChars.length())));
            generatedPassword.add(allChars.charAt(random.nextInt(allChars.length())));

            for (int i = 6; i < length; i++) {
                generatedPassword.add(allChars.charAt(random.nextInt(allChars.length())));
            }

            System.out.print("Generated Secure Password: ");
            for (char character : generatedPassword) {
                System.out.print(character);
            }
        }
    }
}
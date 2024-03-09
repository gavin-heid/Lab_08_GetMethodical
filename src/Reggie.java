import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(scanner, "Enter your SSN (XXX-XX-XXXX)", "^\\d{3}-\\d{2}-\\d{4}$");

        String mNumber = SafeInput.getRegExString(scanner, "Enter your UC Student M number (MXXXXX or mXXXXX)", "^(M|m)\\d{5}$");

        String menuChoice = SafeInput.getRegExString(scanner, "Enter a menu choice (O, S, V, Q)", "^[OoSsVvQq]$");

        System.out.println("SSN: " + ssn);
        System.out.println("UC Student M number: " + mNumber);
        System.out.println("Menu Choice: " + menuChoice);

    }
}

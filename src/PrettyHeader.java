import java.util.Scanner;
public class PrettyHeader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the header text: ");
        String headerText = scanner.nextLine();

        SafeInput.prettyHeader(headerText);

        scanner.close();
    }
}


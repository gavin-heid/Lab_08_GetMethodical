import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int year = SafeInput.getRangedInt(scanner, "Enter the year of birth (1950-2015):", 1950, 2015);
        int month = SafeInput.getRangedInt(scanner, "Enter the month of birth (1-12):", 1, 12);
        int day = getRangedDay(scanner, "Enter the day of birth:", month);
        int hours = SafeInput.getRangedInt(scanner, "Enter the hour of birth (1-24):", 1, 24);
        int minutes = SafeInput.getRangedInt(scanner, "Enter the minute of birth (1-59):", 1, 59);

        System.out.println("Birth Date and Time: " + year + "-" + month + "-" + day + " " + hours + ":" + minutes);

    }

    private static int getRangedDay(Scanner scanner, String prompt, int month) {
        int daysInMonth;

        switch (month) {
            case 2: // February
                daysInMonth = 29; // Assuming a leap year for simplicity
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 31;
        }
        return SafeInput.getRangedInt(scanner, prompt, 1, daysInMonth);

    }
}
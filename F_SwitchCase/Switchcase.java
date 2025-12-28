package F_SwitchCase;
import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {
        String dayName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (1-7) to get the corresponding day of the week:");
        int day = scanner.nextInt();    
        scanner.close();

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("The day is: " + dayName);
    }
}

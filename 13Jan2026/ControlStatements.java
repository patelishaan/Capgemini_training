/**
 * Java Control Statements - if, if-else, switch
 * Topic: Programming Foundation with Java - 13 Jan 2026
 */
public class ControlStatements {
    public static void main(String[] args) {
        int score = 75;

        // if statement
        if (score >= 60) {
            System.out.println("You passed!");
        }

        // if-else
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        // switch statement
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            default: System.out.println("Weekend");
        }

        // Ternary operator (conditional expression)
        String result = (score >= 60) ? "Pass" : "Fail";
        System.out.println("Result: " + result);
    }
}

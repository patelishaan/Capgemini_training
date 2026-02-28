/**
 * Revision - Key concepts from Jan 13-16
 * Topic: Revision - 17 Jan 2026
 * Use this file to practice or add your own revision exercises.
 */
public class RevisionNotes {
    public static void main(String[] args) {
        // Quick revision: operators, control flow, loops, arrays
        int a = 10, b = 3;
        System.out.println("Operators: " + a + " % " + b + " = " + (a % b));

        // Control: ternary
        String pass = (a > 5) ? "Yes" : "No";
        System.out.println("Control: " + pass);

        // Loop: sum
        int sum = 0;
        for (int i = 1; i <= 5; i++) sum += i;
        System.out.println("Loop sum 1..5: " + sum);

        // Array
        int[] arr = {1, 2, 3};
        System.out.println("Array length: " + arr.length);
    }
}

/**
 * Java break and continue statements
 * Topic: Programming Foundation with Java - 15 Jan 2026
 */
public class BreakAndContinue {
    public static void main(String[] args) {
        // break - exit the loop immediately
        System.out.println("break example - stop at 5:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) break;
            System.out.print(i + " ");
        }
        System.out.println();

        // continue - skip current iteration
        System.out.println("\ncontinue example - skip even numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();

        // labeled break (break out of nested loops)
        System.out.println("\nLabeled break:");
        outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) break outer;
                System.out.println("i=" + i + " j=" + j);
            }
        }
    }
}

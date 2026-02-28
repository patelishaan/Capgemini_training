/**
 * Java Loops - for, while, do-while
 * Topic: Programming Foundation with Java - 15 Jan 2026
 */
public class Loops {
    public static void main(String[] args) {
        // for loop
        System.out.println("for loop - print 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // while loop
        System.out.println("\nwhile loop - countdown:");
        int count = 5;
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println();

        // do-while loop (executes at least once)
        System.out.println("\ndo-while loop:");
        int j = 0;
        do {
            System.out.print(j + " ");
            j++;
        } while (j < 5);
        System.out.println();

        // Enhanced for loop (for-each)
        int[] arr = {10, 20, 30, 40};
        System.out.println("\nEnhanced for (for-each):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

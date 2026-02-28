/**
 * Problem solving with loops - Sum, factorial, prime check
 * Topic: Programming Foundation with Java - 15 Jan 2026
 */
public class ProblemSolving {
    public static void main(String[] args) {
        // Sum of first n numbers
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of 1 to " + n + " = " + sum);

        // Factorial
        int num = 5;
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " = " + factorial);

        // Check if number is prime
        int checkNum = 17;
        boolean isPrime = true;
        if (checkNum <= 1) isPrime = false;
        else {
            for (int i = 2; i <= Math.sqrt(checkNum); i++) {
                if (checkNum % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(checkNum + " is prime: " + isPrime);
    }
}

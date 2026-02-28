/**
 * Java Assignment Operators
 * Topic: Programming Foundation with Java - 13 Jan 2026
 */
public class Assignments {
    public static void main(String[] args) {
        // Simple assignment
        int num = 10;
        System.out.println("Simple assignment: num = " + num);

        // Compound assignment operators
        num += 5;  // num = num + 5
        System.out.println("After += 5: num = " + num);

        num -= 3;  // num = num - 3
        System.out.println("After -= 3: num = " + num);

        num *= 2;  // num = num * 2
        System.out.println("After *= 2: num = " + num);

        num /= 4;  // num = num / 4
        System.out.println("After /= 4: num = " + num);

        num %= 3;  // num = num % 3
        System.out.println("After %= 3: num = " + num);

        // Multiple assignment (same value to multiple variables)
        int p = 0, q = 0, r = 0;
        p = q = r = 100;
        System.out.println("\nMultiple assignment: p=" + p + ", q=" + q + ", r=" + r);
    }
}

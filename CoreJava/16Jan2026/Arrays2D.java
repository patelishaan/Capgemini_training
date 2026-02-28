/**
 * Two-dimensional arrays in Java
 * Topic: Programming Foundation with Java - 16 Jan 2026
 */
public class Arrays2D {
    public static void main(String[] args) {
        // Declaration and creation
        int[][] matrix = new int[3][3];

        // Initialization
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = (i + 1) * (j + 1);
            }
        }

        // 2D array literal
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("2D Array (matrix):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nJagged array - rows can have different lengths:");
        int[][] jagged = {{1, 2}, {3, 4, 5}, {6}};
        for (int[] row : jagged) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

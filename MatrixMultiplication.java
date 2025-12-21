import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read rows & columns of Matrix A
        System.out.print("Enter rows of A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter columns of A: ");
        int c1 = sc.nextInt();

        // Read rows & columns of Matrix B
        System.out.print("Enter rows of B: ");
        int r2 = sc.nextInt();
        System.out.print("Enter columns of B: ");
        int c2 = sc.nextInt();

        // Check if multiplication is possible
        if (c1 != r2) {
            System.out.println("Multiplication NOT possible! (c1 must equal r2)");
            return;
        }

        int A[][] = new int[r1][c1];
        int B[][] = new int[r2][c2];
        int C[][] = new int[r1][c2];

        // Input Matrix A
        System.out.println("Enter Matrix A:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j] = sc.nextInt();

        // Input Matrix B
        System.out.println("Enter Matrix B:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                B[i][j] = sc.nextInt();

        // Multiply matrices
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                C[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Output result matrix
        System.out.println("Result Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}

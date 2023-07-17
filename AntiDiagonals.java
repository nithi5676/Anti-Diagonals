package antiDiagonals;

import java.util.Scanner;

public class AntiDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter no. fo row: ");
        int row = scanner.nextInt();
        System.out.print("enter no. fo column: ");
        int column = scanner.nextInt();
        int array[][] = new int[row][column];
        System.out.println("enter 2d array Elements ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        diagonals(array, column, row);

    }

    public static void diagonals(int[][] array, int column, int row) {
        for (int x = 0; x < column; x++) {
            int i = 0, j = x;
            while (i < row && j >= 0) {
                System.out.print(array[i][j] + " ");
                i++;
                j--;
            }
            for (int k = column - 1; k > x; k--) {
                System.out.print(0 + " ");
            }
            System.out.println();
        }
        for (int x = 1; x < row; x++) {
            int i = x, j = column - 1;
            while (i < row && j >= 0) {
                System.out.print(array[i][j] + " ");
                i++;
                j--;
            }
            for (int k = row - 1; k > x - 1; k--) {
                System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
}

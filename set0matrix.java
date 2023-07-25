import java.util.*;

class set0matrix {
    static void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    int ind = i - 1;
                    while (ind >= 0) {
                        if (matrix[ind][j] != 1) {
                            matrix[ind][j] = -1;
                        }
                        ind--;
                    }
                    ind = i + 1;
                    while (ind < rows) {
                        if (matrix[ind][j] != 1) {
                            matrix[ind][j] = -1;
                        }
                        ind++;
                    }
                    ind = j - 1;
                    while (ind >= 0) {
                        if (matrix[i][ind] != 1) {
                            matrix[i][ind] = -1;
                        }
                        ind--;
                    }
                    ind = j + 1;
                    while (ind < cols) {
                        if (matrix[i][ind] != 1) {
                            matrix[i][ind] = -1;
                        }
                        ind++;
                    }
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < 0) {
                    matrix[i][j] = 1;
                }
            }
        }
        // for (int i = 0; i <= 2; i++) {
        // for (int j = 0; j <= 3; j++) {
        // setZeroes(mat[i][j]);
        // }
        // }

    }

    public static void main(String[] args) {
        int mat[][] = {
                { 1, 0, 0, 1 },
                { 0, 0, 1, 0 },
                { 0, 0, 0, 0 },
        };

        System.out.println("Matrix Initially");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(" " + mat[i][j]);
            }
            System.out.println();
        }
        setZeroes(mat);
        System.out.println("The Final Matrix is:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

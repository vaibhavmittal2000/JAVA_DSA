package Advance2DArrays;

public class TransposeMatrix {
    public static void printMatrix(int matrix[][]) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transpose(int matrix[][]) {
        int row = matrix.length;
        int columns = matrix[0].length; 

        int newMatrix[][] = new int[columns][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }
        printMatrix(newMatrix);
    }
    public static void main(String[] args) {
        int original[][] = {{2,3,7},{5,6,7}};
        System.out.println("Original matrix is: ");
        printMatrix(original);
        System.out.println("Transpose matrix is: ");
        transpose(original);
    }
}
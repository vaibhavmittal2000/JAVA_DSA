package Advance2DArrays;

public class DiagonalSum {
    //Optimized Code => O(n)
    public static int sum(int matrix[][]) {
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            //Primary Diagonal
            sum += matrix[i][i];
            //Secondary Diagonal
            if(i != matrix.length-1-i){ // Case of odd matrix where middle element not added twice
                sum += matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }

    // Brute force Code => O(n^2)
    // public static int sum(int matrix[][]) {
    //     int sum = 0;
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix.length;j++){
    //             //Primary Diagonal
    //             if(i == j){
    //                 sum += matrix[i][j];
    //             }
    //             else if(i+j == matrix.length-1){
    //                 sum += matrix[i][j];
    //             }
    //         }
    //     }
    //     return sum;
    // }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("Sum of diagonals are: "+sum(matrix));
    }
}
package Advance2DArrays;

public class StairCaseSearch {
    public static boolean search(int matrix[][],int key){
        int row = 0;
        int col = matrix[0].length-1;

        while (row < matrix.length && col >= 0) {
            if(matrix[row][col] == key){
                System.out.print("Found at position ("+row+","+col+")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        search(matrix, 15);
    }
}
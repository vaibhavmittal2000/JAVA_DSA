package Advance2DArrays;
import java.util.*;

public class Basic {
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j] == key){
                    System.out.print("Found at position ("+i+","+j+")");
                    return true;
                } 
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows in 2D array: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns in 2D array: ");
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];
        //Input
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("Enter elements in 2D array at position ("+i+","+j+"): ");
                matrix[i][j] = sc.nextInt();
            }
        }
        //Output
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix, 5);
    }
}
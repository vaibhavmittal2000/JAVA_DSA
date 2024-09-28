package Recursion;

public class IncreasingNum {
    public static void printInc(int num) {
        //Base Case
        if(num == 1){
            System.out.print(num+" ");
            return;
        }
        printInc(num-1); //Recursion
        System.out.print(num+" ");
    }
    public static void main(String[] args) {
        int n = 10;
        printInc(n);
    }
}

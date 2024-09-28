package Recursion;

public class DecreasingNum {
    public static void printDec(int num) {
        //Base Case
        if(num == 1){
            System.out.println(num);
            return;
        }
        System.out.print(num+" ");
        printDec(num-1); //Recursion
    }
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
}
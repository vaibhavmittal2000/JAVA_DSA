package Recursion;

public class Factorial {
    public static int fact(int num) {
        //Base Case
        if(num == 0){
            return 1;
        }
        int numlessfact = fact(num-1); //Recursion
        int factNum = num * numlessfact;
        return factNum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial is: "+fact(n));
    }
}
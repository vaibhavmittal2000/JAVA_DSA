package Recursion;

public class Fibonacci {
    public static int series(int num) {
        //Base Case
        if(num == 0 || num == 1){
            return num;
        }
        int fibOneLess = series(num - 1);
        int fibTwoLess = series(num - 2);
        // fb(n) = fb(n-1) + f(n-2)
        int resultFinal = fibOneLess + fibTwoLess;
        return resultFinal;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Number is: "+series(n));
    }
}
package Recursion;

public class TilingProblem {
    public static int calcuate(int n){
        //Base Case
        if(n == 0 || n == 1){
            return 1;
        }
        // Vertical Calculate f(n-1) 
        int vertical = calcuate(n-1);
        // Horizontal Calculate f(n-2)
        int horizontal = calcuate(n-2);
        //Total Ways
        int totalWays = vertical + horizontal;

        return totalWays;
    }
    public static void main(String[] args) {
        int number = 6;
        System.out.println("Total ways are: "+calcuate(number));   
    }
}
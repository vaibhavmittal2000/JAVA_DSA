package Recursion;

public class SumOfNNumbers {
    public static int sum(int num) {
        //Base Case
        if(num == 1){
            return 1;
        }
        int numlesssum = sum(num-1); //Recursion
        int sumNum = num + numlesssum;
        return sumNum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum is: "+sum(n));
    }
}

package Recursion;

public class PowerNumber {
    public static int optimized(int number,int pow) { //O(log n)
        if(pow == 0){
            return 1;
        }
        // If power is even
        int halfPower = optimized(number, pow/2);
        int halfPowerSquare = halfPower * halfPower;

        //int halfPowerSquare = optimized(number, pow/2) * optimized(number, pow/2);

        // If power is odd
        if(pow % 2 == 0){
            halfPowerSquare = number * halfPowerSquare;
        }
        return halfPowerSquare;
    }
    public static int calculate(int number,int pow) { //O(n)
        if(pow == 0){
            return 1;
        }
        //Single Statement
        //return number * calculate(number,pow-1);

        int oneLessPower = calculate(number, pow-1);
        int finalResult = number * oneLessPower;
        return finalResult;
    }
    public static void main(String[] args) {
        int number = 2;
        int power = 10;
        System.out.println("Result is: "+calculate(number, power));
        System.out.println("Result is: "+calculate(number, power));
    }
}
package Loops;
import java.util.Scanner;

public class NumberPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if(num == 2){
            System.out.println("Number is prime");
        }
        else{
            //for(int i=2;i<=num-1;i++){ //Runs n-2 times
            for(int i=2;i<=Math.sqrt(num);i++){ //Optimized lopp with less complexity (Runs only half time)
                if(num % i == 0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println("Number is prime");
            }
            else{
                System.out.println("Number is not prime");
            }
        }
    }
}
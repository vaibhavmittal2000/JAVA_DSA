package Functions_Methods;
import java.util.Scanner;

public class Factorial {
    public static int factorial(int num){
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        //int result = factorial(num);
        //System.out.println("Factorial of "+num+" is : "+result);
        System.out.println("Factorial of "+num+" is : "+factorial(num));
    }
}
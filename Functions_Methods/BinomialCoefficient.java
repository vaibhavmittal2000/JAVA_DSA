package Functions_Methods;
import java.util.Scanner;

public class BinomialCoefficient {
    public static int factorial(int num) {
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact *= i;
        }
        return fact;
    }
    public static int calculateAnswer(int num1, int num2){
        int n_fact = factorial(num1);
        int r_fact = factorial(num2);
        int n_r_fact = factorial(num1-num2);
        int bino_coeff = n_fact / (r_fact * n_r_fact);
        return bino_coeff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        System.out.print("Enter the r: ");
        int r = sc.nextInt();
        System.out.println("Binomial Coefficient is: "+calculateAnswer(n,r));
    }
}
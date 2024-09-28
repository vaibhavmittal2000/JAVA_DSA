package Functions_Methods;
import java.util.Scanner;

public class PrimeOrNot {
    public static boolean isPrime(int number){
        if(number == 2){
            return true;
        }
        for(int i=2;i<=number-i;i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean optimizedIsPrime(int number){
        if(number == 2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
        System.out.println(optimizedIsPrime(num));
    }
}
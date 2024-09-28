package Functions_Methods;
import java.util.Scanner;

public class PrimesInRange {
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
    public static void printPrime(int range) {
        for(int i=2;i<=range;i++){
            if(optimizedIsPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int range = sc.nextInt();
        printPrime(range);
    }
}
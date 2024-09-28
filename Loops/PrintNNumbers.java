package Loops;
import java.util.Scanner;

public class PrintNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int startPoint = 1;
        while(startPoint <= num){
            System.out.print(startPoint+" ");
            startPoint++;
        }
    }
}
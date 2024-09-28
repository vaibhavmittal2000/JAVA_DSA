package Loops;
import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range of numbers: ");
        int range = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= range){
            sum += i;
            //sum = sum + i;
            i++;
        }
        System.out.println("Sum is: "+sum);
    }
}
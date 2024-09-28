package Loops;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        //Reverse of a number
        while (number > 0) {
            int lastDigit = number % 10;
            System.out.print(lastDigit+"");
            number = number / 10;
        }
        //Reverse the number
        int reverse = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        System.out.println("Reverse is: "+reverse);
    }
}
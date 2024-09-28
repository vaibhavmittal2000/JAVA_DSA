package Conditionals;
import java.util.Scanner;

public class NumberOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.print("Number is even: "+num);
        }
        else{
            System.out.println("Number is odd: "+num);
        }
    }
}
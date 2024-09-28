package Conditionals;
import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter a choice: ");
        char choice = sc.next().charAt(0);
        switch (choice) {
            case '+':
                System.out.println("Sum is: "+(a+b));
                break;
            case '-':
                System.out.println("Difference is: "+(a-b));
                break;
            case '*':
                System.out.println("Multiplication is: "+(a*b));
                break;
            case '/':
                System.out.println("Division is: "+(a/b));
                break;
            case '%':
                System.out.println("Remainder is: "+(a%b));
                break;
            default:
                System.out.println("Your choice is not listed");
                break;
        }   
    }
}
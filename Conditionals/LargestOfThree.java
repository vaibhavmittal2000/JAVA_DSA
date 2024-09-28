package Conditionals;
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        if(a == b && b == c){
            System.out.println("All three numbers are equal!");
        }
        else if(a > b && a > c){
            System.out.println("A is largest");
        }
        else if(b > c){
            System.out.println("B is largest");
        }
        else{
            System.out.println("C is largest");
        }
    }
}
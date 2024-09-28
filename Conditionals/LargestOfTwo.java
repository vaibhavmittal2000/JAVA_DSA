package Conditionals;
import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        if(a > b){
            System.out.println("Value of a is greater which is: "+a);
        }
        else if(a == b){
            System.out.println("Both values are same or equal!");
        }
        else{
            System.out.println("Value of b is greater which is: "+b);
        }
    }
}
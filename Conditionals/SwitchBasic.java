package Conditionals;
import java.util.Scanner;

public class SwitchBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Vaibhav");
                break;
            case 3:
                System.out.println("Mittal");
                break;
            default:
                System.out.println("Your choice is not listed");
                break;
        }
    }
}
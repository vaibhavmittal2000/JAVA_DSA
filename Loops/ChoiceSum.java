package Loops;
import java.util.Scanner;

public class ChoiceSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do{
            System.out.print("Enter number: ");
            int number = sc.nextInt();

            if(number % 2 == 0){
                evenSum += number;
            }
            else{
                oddSum += number;
            }

            System.out.print("Do you want to continue? Press 1 for YES and 0 for NO: ");
            choice = sc.nextInt();
        }while(choice == 1);

        System.out.println("Even sum is: "+evenSum);
        System.out.println("Odd sum is: "+oddSum);
    }
}
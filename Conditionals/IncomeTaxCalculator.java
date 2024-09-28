package Conditionals;
import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        int income = sc.nextInt();
        int tax;
        if(income < 500000){
            System.out.println("Your tax is in slab 1");
            tax = 0;
        }
        else if(income >=500000 && income <=1000000){
            System.out.println("Your tax is in slab 2");
            tax = (int)(0.2 * income);
        }
        else{
            System.out.println("Your tax is in slab 3");
            tax = (int)(0.3 * income);
        }
        System.out.println("Your tax will be: "+tax);
    }
}
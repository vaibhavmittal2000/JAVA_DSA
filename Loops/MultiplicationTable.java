package Loops;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println(num+" * "+i+" : "+num*i);
        }
    }
}
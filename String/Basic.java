package String;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        //Ways to initalize a String
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");

        //Strings are immutable that is they can't be changed

        //Input string from a user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next(); //Only one word before the space
        sc.nextLine(); //Consume the leftover newline character
        System.out.println("Your entered name is: "+name); //Output the entered name
        System.out.println("Length of entered string is: "+name.length()); //Length of a string

        System.out.print("Enter your full name: ");
        String name1 = sc.nextLine(); //Complete line of words including space
        System.out.println("Your entered full name is: "+name1); //Output the entered name
        System.out.println("Length of entered string is: "+name1.length()); //Length of a string

        //Concatenation
        String firstName = "Vaibhav";
        String lastname = "Mittal";
        String fullName = firstName+" "+lastname;
        System.out.println("Full name is: "+fullName);
    }
}
package String;
import java.util.Scanner;

public class Palindrome {
    public static boolean verify(String str){
        int n = str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String value = sc.next();
        System.out.println("Entered string is: "+value);
        if(verify(value) == true){
            System.out.println("It's a palindrome");
        }
        else{
            System.out.println("Not a palindrome!");
        }
    }
}
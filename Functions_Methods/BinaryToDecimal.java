package Functions_Methods;
import java.util.Scanner;

public class BinaryToDecimal {
    public static int convert(int binNum){
        int power = 0;
        int decimal = 0;
        while(binNum > 0){
            int lastDigit = binNum % 10;
            decimal = decimal + (lastDigit * (int)Math.pow(2, power));
            power++;
            binNum = binNum / 10;
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your binary number: ");
        int number = sc.nextInt();
        System.out.println("Decimal of "+number+" is: "+convert(number));
    }
}
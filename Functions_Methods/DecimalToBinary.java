package Functions_Methods;
import java.util.Scanner;

public class DecimalToBinary {
    public static int convert(int decNum){
        int power = 0;
        int binary = 0;
        while(decNum > 0){
            int remainder = decNum % 2;
            binary = binary + (remainder * (int)Math.pow(10, power));
            power++;
            decNum = decNum / 2;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your decimal number: ");
        int number = sc.nextInt();
        System.out.println("Binary of "+number+" is: "+convert(number));
    }
}

package Practice;
import java.util.*;

public class Practice1{
    public static void main(String[] args) {
        /*  Question 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        int average = (a+b+c)/3;
        System.out.println("Average is: "+average);
        */

        /*  Question 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("Area is: "+area);
        */

        // Question 3
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter price of pen: ");
        float pen = sc.nextFloat();
        System.out.print("Enter price of eraser: ");
        float eraser = sc.nextFloat();
        float total = pencil+pen+eraser;
        System.out.println("Total price is: "+total);
        // Total price with 18% GST
        float newTotal = total + (0.18f * total);
        System.out.println("Total proce with GST is: "+newTotal);
        
    }
}
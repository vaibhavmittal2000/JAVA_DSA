package Arrays;
import java.util.Scanner;

public class LinearSearchString {
    public static int searchLinearString(String menu[], String value){
        for(int i=0;i<menu.length;i++){
            if(menu[i].equals(value)){
                return i;
            }
        }
        return -1;
    }
    public static String[] inputTake(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Declare the array with size 'n'
        String arr[] = new String[n];

        // Use a loop to take input for each element
        System.out.println("Enter " + n + " elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.next(); // Reading each element
        }

        // Display the elements of the array
        System.out.print("The array elements are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        return arr;
    }
    public static void main(String[] args) {
        String searchArray[] = inputTake();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value to search: ");
        String value = scanner.next();
        int index = searchLinearString(searchArray, value);
        if(index == -1){
            System.out.println("There is no such value in the array");
        }
        else{
            System.out.println("Number found at index: "+index);
        }
    }
}
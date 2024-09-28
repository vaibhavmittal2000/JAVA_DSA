package Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static int searchLinear(int number[], int value){
        for(int i=0;i<number.length;i++){
            if(number[i] == value){
                return i;
            }
        }
        return -1;
    }
    public static int[] inputTake(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Declare the array with size 'n'
        int arr[] = new int[n];

        // Use a loop to take input for each element
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();  // Reading each element
        }
        // Display the elements of the array
        System.out.print("The array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }
    public static void main(String[] args) {
        int searchArray[] = inputTake();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value to search: ");
        int value = scanner.nextInt();
        int index = searchLinear(searchArray, value);
        if(index == -1){
            System.out.println("There is no such value in the array");
        }
        else{
            System.out.println("Number found at index: "+index);
        }
    }
}
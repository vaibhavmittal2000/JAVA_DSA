package Practice;
import java.util.*;

public class Practice3 {
    public static int occurence(String str,char key){
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == key){
                count++;
            }
        }
        return count;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void changeArray(int arr[]) {
        int n = arr.length;
        int mid = (n - 1) / 2;

        // Sort left half in ascending order
        Arrays.sort(arr, 0, mid + 1);

        // Sort right half in descending order
        Arrays.sort(arr, mid + 1, n);
        reverseArray(arr, mid + 1, n - 1);

        // Print the modified array
        System.out.println("Modified Array (Left Ascending, Right Descending):");
        printArray(arr);
    }
    public static void reverseArray(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 3, 5, 6, 7};

        System.out.println("Original Array:");
        printArray(arr);
        
        changeArray(arr);
    }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a string: ");
    //     String word = sc.next();
    //     System.out.println("Enter a key: ");
    //     //char key = sc.next().charAt(0);
    //     System.out.println("The count is: "+occurence(word,key));
    // }
}

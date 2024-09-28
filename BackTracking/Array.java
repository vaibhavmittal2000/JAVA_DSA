package BackTracking;

public class Array {
    public static void changeArray(int arr[],int i,int val){
        //Base Case
        if(i == arr.length){
            printArray(arr);
            return;
        }
        //Recursion Work
        arr[i] = val;
        changeArray(arr, i+1, val+1); //Function Call
        arr[i] = arr[i] - 2; //Backtracking
    }
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArray(arr, 0, 1);
        printArray(arr);
    }
}
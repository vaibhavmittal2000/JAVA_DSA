package Recursion;

public class ArraySort {
    public static boolean checkSort(int arr[],int startPoint){
        //Base Case
        if(startPoint == arr.length-1){
            return true;
        }
        if(arr[startPoint] > arr[startPoint+1]){
            return false;
        }
        return checkSort(arr, startPoint+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,6,9,7};
        System.out.println(checkSort(arr, 0));
    }
}
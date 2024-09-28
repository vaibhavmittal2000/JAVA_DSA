package Recursion;

public class NumOccurence {
    public static int firstOccurece(int arr[],int key,int i) {
        //Base Case
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurece(arr, key, i+1);
    }
    public static int lastOccurece(int arr[],int key,int i) {
        //Base Case
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurece(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,3,6,9,7};
        int key = 3;
        System.out.println("The number occur at: "+firstOccurece(arr, key, 0));
        System.out.println("The number occur at: "+lastOccurece(arr, key, 0));
    }
}
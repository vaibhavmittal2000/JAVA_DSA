package DivideAndConquer;

public class QuickSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void sort(int arr[],int si,int ei){
        //Base Case
        if(si >= ei){
            return;
        }
        int partitionIndex = partition(arr,si,ei);
        //Left Part Sort
        sort(arr,si,partitionIndex-1);
        //Right Part Sort
        sort(arr,partitionIndex+1,ei);
    }
    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei]; //Last element
        int i = si-1; //To make place for elements smaller than pivot

        for(int j=si;j<ei;j++){
            if(arr[j] < pivot){
                i++;
                //Swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // For pivot to be in right place
        i++;
        //Swap
        int temp = pivot;
        arr[ei] = arr[i];  // arr[ei] is equal to pivot
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5,-5};
        sort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
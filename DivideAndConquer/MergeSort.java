package DivideAndConquer;

public class MergeSort {
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
        int mid = si + (ei - si) / 2;  // OR mid = (si + ei)/2
        //Left Part Sort
        sort(arr, si, mid);
        //Right Part Sort
        sort(arr, mid+1, ei);
        //Combine Both  Sorted Result Part
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei) {   
        /*Left Part index(0,3) = 4 elements and Right Part index(4,6) = 3 elements
        Total elemets = 7. So si = 0 and ei = 6 => [6-0] but we need total 7 so => [ei-si+1] = [6-0+1]
        */ 
        int temp[] = new int[ei-si+1];
        int i = si; //Itrator for left part
        int j = mid+1; //Itrator for right part
        int k = 0; //Itrator for temp part

        while (i <=mid && j<=ei) {
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //Left part elements left
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        //Right part elements left
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        //Copy temp elements to original array
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        sort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
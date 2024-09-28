package DivideAndConquer;

public class RotatedSortedSearch {
    public static int search(int arr[],int target,int si,int ei){
        //Base Case
        if(si > ei){
            return -1;
        }

        int mid = si + (ei - si) / 2;

        //Case Found
        if(arr[mid] == target){
            return mid;
        }
        //Mid on L1
        if(arr[si] <= arr[mid]){
            //Case a: Left Part
            if(arr[si] <= target && target <= arr[mid]){
                return search(arr, target, si, mid-1);
            }
            //Case b: Right Part
            else{
                return search(arr, target, mid+1, ei);
            }
        }
        //Mid on L2
        else{
            //Case c: Right Part
            if(arr[mid] <= target && target <= arr[ei]){
                return search(arr, target, mid+1, ei);
            }
            //Case d: Left Part
            else{
                return search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0; // Output => 4
        int targetIndex = search(arr, target, 0, arr.length-1);
        System.out.println("Found at: "+targetIndex);
    }
}
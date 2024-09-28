package Arrays;

public class BinarySearch {
    public static int searchBinary(int numbers[], int value){
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if(numbers[mid] == value){ //Value Equal OR (In the end results found)
                return mid;
            }
            if(numbers[mid] < value){ //Right Side
                start = mid + 1; 
            }
            else{ //Left Side
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {1,4,6,7,8};
        int value = 6;
        int index = searchBinary(number, value);
        if(index == -1){
            System.out.println("There is no such value in the array");
        }
        else{
            System.out.println("Number found at index: "+index);
        }
    }
}
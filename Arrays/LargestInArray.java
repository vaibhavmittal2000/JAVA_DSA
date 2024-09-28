package Arrays;

public class LargestInArray {
    public static int findSmallest(int number[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        return smallest;
    }
    public static int findLargest(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest < number[i]){
                largest = number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,5,3,2};
        System.out.println("Smallest element is: "+findSmallest(numbers));
        System.out.println("Largest element is: "+findLargest(numbers));
    }
}
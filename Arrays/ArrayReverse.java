package Arrays;

public class ArrayReverse {
    public static void reverse(int numbers[]){
        int start = 0;
        int end = numbers.length - 1;
        while(start < end){
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;
            start++;
            end--;
        }
    }
    public static void print(int numbers[]) {
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5};
        reverse(number);
        //Print the reverse array
        print(number);
    }
}

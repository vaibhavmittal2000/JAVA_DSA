package Arrays;

public class PrintSubarrays {
    public static void printSubarray(int numbers[]) {
        int totalPairs = 0;
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                totalPairs++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total pairs are: "+totalPairs);
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5};
        printSubarray(number);
    }
}

package Arrays;

public class MaxSubarraySumBruteForce {
    public static void maxSubarraySum(int numbers[]){ // Complexity => O(n^3) Worst
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                currSum = 0;
                for(int k=start;k<=end;k++){
                    // Sum of subarrays
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximu subarray sum is: "+maxSum);
    }
    public static void main(String[] args) {
        int number[] = {1,-2,6,-1,3};
        maxSubarraySum(number);
    }
}
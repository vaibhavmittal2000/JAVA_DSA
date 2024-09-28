package Arrays;

public class MaxSubarraySumKadan {
    public static void maxSubarraySum(int numbers[]){ // Complexity => O(n) Best
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            currSum = currSum + numbers[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Maximu subarray sum is: "+maxSum);
    }
    public static void main(String[] args) {
        int number[] = {1,-2,6,-1,3};
        maxSubarraySum(number);
    }
}
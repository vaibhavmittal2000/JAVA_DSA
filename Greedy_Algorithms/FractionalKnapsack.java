package Greedy_Algorithms;
import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int value[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;

        //0th Column => Index and 1st Column => Ratio 
        double ratio[][] = new double[value.length][2];

        for(int i=0;i<value.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }
        //Ascending order Sorting Ratio array using lambda function
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalValue = 0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){ //Include Full Item
                finalValue += value[idx];
                capacity -= weight[idx];
            }
            else{ //Include Fractional Item
                finalValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Final Value: "+finalValue);
    }
}
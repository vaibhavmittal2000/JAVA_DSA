package Greedy_Algorithms;
import java.util.*;

public class MaxLengthChain {
    public static void main(String[] args) { //O(nlogn)
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));

        int chainLength = 1;
        int chainEnd = pairs[0][1]; //Last selected pair end //Chain end

        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0] > chainEnd){
                chainLength++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("Maximum length of chain is: "+chainLength);
    }
}
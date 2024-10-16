package Greedy_Algorithms;
import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = {10,12,20};
        int end[] = {20,25,30}; 

        //Sorting(If given elements are not sorted)
        int activities[][] = new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //Lambda Function to Sort (Short Form for a function)
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));

        //If actvivties are sorted acc to end time
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        //1st Activity
        maxAct = 1;
        ans.add(0);
        //ans.add(activities[0][0]);
        //int lastEnd = activities[0][2];
        int lastEnd = end[0];
        for(int i=1;i<end.length;i++){
            //if (activities[i][1] >= lastEnd) {
            if (start[i] >= lastEnd) {
                //Activity Select
                maxAct++;
                ans.add(i);
                //ans.add(activities[i][0]);
                lastEnd = end[i];
                //lastEnd = activities[i][2];
            }
        }
        System.out.println("Maximum activities are: "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
package ArrayList;
import java.util.ArrayList;

public class PairSumSorted {
    public static boolean pairSum1(ArrayList<Integer> list,int target){
        // Brute Force Code -- O(n^2)
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean newPairSum1(ArrayList<Integer> list,int target){
        //2 Pointer Approach Code -- O(n)
        int lp = 0;
        int rp = list.size()-1;

        while(lp != rp){
            //Case 1:
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            //Case 2:
            if(list.get(lp) + list.get(rp) < target){
                lp++;
            }
            else{ //Case 3:
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //Sorted => 1,2,3,4,5,6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6); 

        int target = 5;
        System.out.println(pairSum1(list, target));
        System.out.println(newPairSum1(list, target));
    }
}
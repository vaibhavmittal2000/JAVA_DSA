package ArrayList;
import java.util.ArrayList;

public class FindMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        
        int maximum = Integer.MIN_VALUE;
        for(int i=0;i<list.size()-1;i++){
            if(maximum < list.get(i)){
                maximum = list.get(i);
            }
            //maximum = Math.max(maximum,list.get(i));
        }
        System.out.println("Maximum element in ArrayList is: "+maximum);
    }
}
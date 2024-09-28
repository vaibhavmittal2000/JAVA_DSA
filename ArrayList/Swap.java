package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Swap {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        System.out.println("List before swap is: "+list);
        int idx1 = 1;
        int idx2 = 3;
        swap(list,idx1,idx2);
        System.out.println("List after swap is: "+list);

        //Sorting with inbuilt method
        Collections.sort(list); //Ascending Order
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder()); //Descending Order
        System.out.println(list);
    }
}
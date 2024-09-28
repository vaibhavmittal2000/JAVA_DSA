package ArrayList;
import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //Add element
        list.add(1);
        //Add element at some index
        list.add(1,5);
        list.add(3);
        list.add(4);
        //Get element of some index
        int element = list.get(2);
        System.out.println("Element is: "+element);
        //Remove element at some index
        list.remove(3);
        //Set element at some index
        list.set(2, 7);
        System.out.println(list);
        //Checks if element is there or not
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
        //Checks the size of ArrayList
        System.out.println(list.size());

        //Print all elements in the ArrayList
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
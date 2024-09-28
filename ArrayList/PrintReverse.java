package ArrayList;
import java.util.ArrayList;

public class PrintReverse {
    public static void main(String[] args) {
        ArrayList<Integer> rev = new ArrayList<>();
        rev.add(1);
        rev.add(2);
        rev.add(3);
        rev.add(4);
        rev.add(5);

        //Reverse Logic
        for(int i=rev.size()-1;i>=0;i--){
            System.out.print(rev.get(i)+" ");
        }
        System.out.println();
    }
}

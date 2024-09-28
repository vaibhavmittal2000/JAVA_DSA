package Important;
import java.util.ArrayList;

public class MostWater {
    public static int maxWater(ArrayList<Integer> height) {
        int maxWater = 0;
        // Brute Force Code -- O(n^2)
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int hit = Math.min(height.get(i), height.get(j));
                int wid = j - i;
                int currWater = hit * wid;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;    
    }
    public static int maxWaterNew(ArrayList<Integer> height) {
        int maxWater = 0;
        //2 Pointer Approach Code -- O(n)
        int lp = 0;
        int rp = height.size()-1;

        while(lp < rp){
            //Calculate water area
            int hit = Math.min(height.get(lp), height.get(rp));
            int wid = rp - lp;
            int currWater = hit * wid;
            maxWater = Math.max(maxWater, currWater);
            //Update pointer
            if(height.get(lp) < height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;    
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        // 1,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4); 
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Maximum water is: "+maxWater(height));
        System.out.println("Maximum water is: "+maxWaterNew(height));
    }
}
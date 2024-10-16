package Greedy_Algorithms;
import java.util.*;

public class Chocola {
    public static void main(String[] args) {
        //n = 4 & m = 6
        Integer costVert[] = {2,1,3,1,4}; //m-1
        Integer costHor[] = {4,1,2}; //n-1

        Arrays.sort(costVert,Comparator.reverseOrder());
        Arrays.sort(costHor,Comparator.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < costHor.length && v < costVert.length) {
            if(costVert[v] <= costHor[h]){ //Horizontal Cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
            }
            else{ //Vertical Cut
                cost += (costVert[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        while (v < costVert.length) {
            cost += (costVert[v] * hp);
            vp++;
            v++;
        }
        System.out.println("Minimum cost of cuts: "+cost);
    }
}
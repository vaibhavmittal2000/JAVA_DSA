package BackTracking;

public class Subsets {
    public static void findSubsets(String str,String ans,int idx){
        //Base Case
        if(idx == str.length()){
            if(ans.length() == 0){
                System.out.println("NULL");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //Yes Choice (Recursion)
        findSubsets(str, ans+str.charAt(idx), idx+1);
        //No Choice (Recursion) (Backtracking)
        findSubsets(str, ans, idx+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
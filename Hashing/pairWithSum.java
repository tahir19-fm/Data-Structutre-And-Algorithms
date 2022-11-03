import java.util.HashSet;

public class pairWithSum {
   static boolean ispair(int []arr,int sum){
        HashSet<Integer> h=new HashSet<>();
        for(int x:arr){
            if(h.contains(sum-x)){
                return true;
            }else{
                h.add(x);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={3,2,8,15,-8};
        System.out.println(ispair(arr, 17));
    }
}

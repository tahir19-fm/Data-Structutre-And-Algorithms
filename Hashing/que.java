import java.util.HashMap;
import java.util.Map;

public class que {
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        if(arr==null){
            return -1;
        }
        int res=n;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            if(m.containsKey(arr[i])){
                res=Math.min(res,m.get(arr[i]));
            }else{
                m.put(arr[i],i+1);
            }
        }
        return res<n ? res:-1;
    }
    public static void main(String[] args) {
        
    }
}

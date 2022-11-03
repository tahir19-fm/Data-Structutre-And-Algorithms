import java.util.HashMap;
import java.util.Map;

public class longestSubSum {
    static int longest(int arr[],int sum){
        Map<Integer,Integer> m=new HashMap<Integer,Integer>();
        int presum=0,res=0;
        for(int i=0;i<arr.length;i++){
            presum +=arr[i];
            if(presum==sum){
                res=i+1;
            }
            if(m.containsKey(presum)==false){
                m.put(presum, i);
            }
            if(m.containsKey(presum-sum)){
                res=Math.max(res, i-m.get(presum-sum));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={3,1,0,1,8,2,3,6};
        int sum=5;
        System.out.println(longest(arr, sum));
    }
}

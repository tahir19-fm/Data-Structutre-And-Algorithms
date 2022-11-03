import java.util.HashSet;

public class longConsecutive {
    static int longest(int arr[]){
        HashSet<Integer> h=new HashSet<>();
        int res=0;
        for(int x:arr){
            h.add(x);
        }
        for(int i=0;i<arr.length;i++){
            if(!h.contains(arr[i]-1)){
                int curr=1;
                while(h.contains(curr+arr[i])){
                    curr++;
                }
                res=Math.max(res, curr);
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int arr[]={1,9,3,4,2,20};
        System.out.println(longest(arr));
    }
}


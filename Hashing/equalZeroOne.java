
public class equalZeroOne {
    static int equal(int arr[]){
        longestSubSum m=new longestSubSum();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
            arr[i]=-1;
        }
        return longestSubSum.longest(arr, 0);

    }
    public static void main(String[] args) {
       int arr[]={1,0,1,1,1,0,0};
       System.out.println(equal(arr));
        
    }
}

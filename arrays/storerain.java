public class storerain {
    public static int strrain(int arr[]){
        int n=arr.length;
        int res =0;
        for(int i=1;i<n-1;i++){
        int lmax=arr[i];
        for(int j=0;j<i;j++){
            
            lmax=Math.max(lmax, arr[j]);
        }             
        int rmax=arr[i];
        for(int j=i+1;j<n;j++){
            rmax=Math.max(rmax, arr[j]);
        }
        res +=Math.min(lmax, rmax)-arr[i];

        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int ans = strrain(arr);
        System.out.println(ans);

    }
    
}

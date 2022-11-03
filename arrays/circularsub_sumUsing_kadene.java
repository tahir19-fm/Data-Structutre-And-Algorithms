public class circularsub_sumUsing_kadene {
    static int kadenesum(int arr[],int n){
        int res=arr[0],max_ending=arr[0];
        for(int i=1;i<n;i++){
            max_ending = Math.max(arr[i], max_ending + arr[i]);
            res=Math.max(res, max_ending);
        }
        return res;
    }
    static int totalcircleSum(int arr[],int n){
        int max_normal=kadenesum(arr, n);
        if(max_normal<0){
            return max_normal;

        }
        int arr_sum=0;
        for(int i=0;i<n;i++){
        arr_sum +=arr[i];
        arr[i]=-arr[i]; // this is the inversion of the array and later below we call this inverted array throufgh recusrion to get the maximum of the invewrted array using the recurrsion call foor the kaldene method fumction
        }
        int CircularMax=arr_sum+kadenesum(arr, n);
        return Math.max(max_normal, CircularMax);
    }
    public static void main(String[] args) {
        int arr[]={8,-4,3,-5,4};
        int n=arr.length;
        int ans = totalcircleSum(arr, n);
        System.out.println(ans);



    }
    
}

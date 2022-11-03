public class buystock1 {
    public static int maxPro(int arr[],int start ,int end){
        if(end<=start){
            return 0;
        }
        int profit =0;
        for(int i=start;i<end;i++){
            for(int j=i+1;j<end;j++){
                if(arr[j]>arr[i]){
                    int currprofit=arr[j]-arr[i]+maxPro(arr, start,i-1)+maxPro(arr,j+1, end);
                    profit=Math.max(profit, currprofit);
                }
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,8,12};
        int ans =maxPro(arr,0,arr.length);
        System.out.println(ans);
        main(args);
        
    }
    
}

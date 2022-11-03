public class freqinSortedAr {
    public static void main(String[] args) {
        int arr[]={10,10,10,25,30,30};
        int freq=1,i=1;
        int n = arr.length;
        while(i<n){
            while(i<n && arr[i]==arr[i-1]){
                i++;
                freq++;
            }
            System.out.println(arr[i-1]+" "+freq);
            i++;
            freq=1;
        }
        if(n==1 || arr[n-1]!=arr[n-2]){
            System.out.println(arr[n-1]+" "+1);
        }
    }
}

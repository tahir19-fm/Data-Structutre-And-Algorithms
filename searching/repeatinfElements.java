public class repeatinfElements {
static int Repeat(int arr[],int n)
{
    boolean[] arr1=new boolean[n];
    for(int i=0;i<n;i++){
        arr1[i]=false;

}
for(int i=0;i<n;i++){
    if(arr1[arr[i]]){
        return arr[i];
    }
    arr1[arr[i]]=true;
}

    return 0;
}
    public static void main(String[] args) {
        int arr[]={0,2,1,3,2,2};
        int n=arr.length;
        int ans=Repeat(arr, n);
        System.out.println(ans);
        
    }
}

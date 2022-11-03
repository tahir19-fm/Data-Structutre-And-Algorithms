public class INdexOfLastOccr {
    static int firstoccur(int arr[],int low ,int high,int x){
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]>x)
            high=mid-1;
            else if(arr[mid]<x)
            low=mid+1;
            else{
                if(mid==high|| arr[mid+1]!=arr[mid])
                return mid;
                else
                low=mid+1;
            }
        }
        return -1;

}









public static void main(String[] args) {
int arr[]={5,10,10,15,16,17,20,20,20,20,20,20,20,20};
int low=0;
int high=arr.length-1;
int x=10;
int ans =firstoccur(arr, low, high, x);
System.out.println(ans);

}
}

    


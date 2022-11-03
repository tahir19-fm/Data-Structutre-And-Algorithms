public class IndexOfIstOccr {
                                        //---RECURSIVE SOL -------//

    // static int firstoccur(int arr[],int low,int high,int x ){ //-----------------The time complexity of given function is O(logn)-------//
    //     if (low>high)return -1;                               //=================This recursive sol alsop requires the aux space of logn====//
    //     int mid=(low+high)/2;
    //     if(x>arr[mid])
    //     return firstoccur(arr, mid+1, high, x);
    //     else if(x<arr[mid])
    //     return firstoccur(arr, low, mid-1, x);
    //     else{
    //         if(mid==0 || arr[mid-1]!=arr[mid]){
    //             return mid;
    //         }else{
    //             return firstoccur(arr, low, mid-1, x);
    //         }
    //     } }




            //-------ITERATIVE SOL -----------------Requires the same time but aux space =O(1)=---------------//


            static int firstoccur(int arr[],int low ,int high,int x){
                    while(low<=high){
                        int mid =(low+high)/2;
                        if(arr[mid]>x)
                        high=mid-1;
                        else if(arr[mid]<x)
                        low=mid+1;
                        else{
                            if(mid==0 || arr[mid-1]!=arr[mid])
                            return mid;
                            else
                            high=mid-1;
                        }
                    }
                    return -1;

            }









    public static void main(String[] args) {
        int arr[]={5,10,10,15,20,20,20};
        int low=0;
        int high=arr.length-1;
        int x=20;
        int ans =firstoccur(arr, low, high, x);
        System.out.println(ans);
        
    }
}

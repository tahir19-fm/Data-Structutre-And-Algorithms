// public class Majority_element {
//     static int countMajority(int arr[],int n){
//         for(int i=0;i<n;i++){
//             int count =1;
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]==arr[j]){
//                     count++;
//                 }
//             }
//             if(count>n/2){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int arr[]={4,5,6,5,6,5,5,5,5,5};
//         int n= arr.length;
//         int ans =countMajority(arr, n);
//         System.out.println(ans);
        
//     }
// }



//-------------------Maurase voting system----------------------//


public class Majority_element{
    static int findMajority(int arr[],int n){
        int res =0,count=1;
        for(int i=1;i<n;i++){
            if(arr[res]==arr[i]){
                count++;
            }else{
                count--;
            }
        
        if(count==0){
            count=1;
            res=i;
        }
        }
        count=0;
        for(int i=0;i<n;i++){
            if(arr[res]==arr[i]){
                count++;
            }
        } 
        if(count<=n/2){
            res=-1;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={8,6,6,6,4,6};
                int n= arr.length;
                int ans =findMajority(arr, n);
                System.out.println(ans);
        
    }
}
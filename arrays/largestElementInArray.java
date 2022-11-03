public class largestElementInArray {
    static int largest(int arr[],int n){
        int largest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    static int SecondLargest(int arr[],int n){
        int Largest=largest(arr, n);
        int scnd=-1;
        for(int i=0;i<n;i++){
            if(arr[i]!=Largest&&arr[i]>scnd){
                scnd=arr[i];
            }
        }
        return scnd;
    }
    public static void main(String[] args) {
    int arr[]={1,2,3,45,6,7,45,34};
    int n=arr.length;
        int ans=largest(arr, n);
        System.out.println("the largest element in the array is "+ans);
        int ans2=SecondLargest(arr, n);
        System.out.println("scnd largest "+ans2);

    }
}

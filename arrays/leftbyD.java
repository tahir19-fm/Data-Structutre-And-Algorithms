import java.util.*;


///////////////////////////                REVERSAL ALGORITH                          ////////////////////////////////////////////////////////////////


public class leftbyD {
    public static void leftrot(int arr[],int d){
        int n=arr.length;
        reverse(arr,0, d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int arr[],int low ,int high){
        while(low<high){
            int temp =arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }


    static void leftrotd(int arr[],int d){

        int[] temp = new int[d];
        for (int i=0;i<d;i++){
            temp[i]=arr[i];

        }
        for(int i=d;i<arr.length;i++){
            arr[i-d]=arr[i];
        }
        for(int i=0;i<d;i++){
            arr[arr.length-d+i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int d= sc.nextInt();
         leftrot(arr, d);
       leftrotd(arr, d);
        
       
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
    
}

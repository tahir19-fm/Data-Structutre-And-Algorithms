import java.lang.reflect.Array;
import java.util.Arrays;

public class deletion {
    static void Deletion(int arr[],int n ,int x){
        int temp=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                temp=i;
                break;
            }
        }
            for(int i=temp;i<n-1;i++){
                arr[i]=arr[i+1];
            }
            arr[n-1]=0;
        
    }
    public static void main(String[] args) {
         int arr[]={1,2,3,4,5};
         int n=arr.length;
         Deletion(arr, n, 3);
         System.out.println(Arrays.toString(arr));

    }
}

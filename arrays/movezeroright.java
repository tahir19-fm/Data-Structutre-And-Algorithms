
//import java.util.*;
public class movezeroright {
    public static void movezeroo(int arr[]){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
               int temp =arr[i];
               arr[i]=arr[count];
               arr[count]=temp;
               count++;
            
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,0,9,0};
        // System.out.println(movezeroright(arr));
         movezeroo(arr);
         for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
         }
        
    }
}

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.stream.events.StartDocument;

public class insertionInArray {
    static void Insertion(int arr[],int n,int position,int element){
        int x=position-1;
        for(int i=n-1;i>=x;i--){
            arr[i]=arr[i-1];
           
        }
        arr[x]=element;



        
    }
    public static void main(String[] args) {
        
        int arr[]=new int[5];
        int n=5;
        for(int i=0;i<4;i++){
            arr[i]=i+1;
               }
               System.out.println(Arrays.toString(arr));
               Insertion(arr, n, 2, 34);
               System.out.println(Arrays.toString(arr));

    }
}

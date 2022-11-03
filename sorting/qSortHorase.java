
public class qSortHorase {

    static int hPartition(int arr[],int l,int h){
        int pivot=arr[l];
        int i=l-1,j=h+1;
        while(true){
            do{i++;}while(arr[i]>pivot);
            do{j--;}while(arr[j]>pivot);
            if(i>=j)return j;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;


        }
      
    }
    static void qSort(int arr[],int l,int h){
        if(l<h){
            int pivot=hPartition(arr, l, h);
            qSort(arr, l, pivot-1);
            qSort(arr,pivot+1,h);
        }
    }
    
    
    
    public static void main(String[] args) {
        
        int arr[]={2,3,2,1,3,4,575,467,5};
        int n=arr.length;
        qSort(arr, 0, n-1);
        for(int i:arr){
            System.out.print(i+" ");
        }


    }
    
}

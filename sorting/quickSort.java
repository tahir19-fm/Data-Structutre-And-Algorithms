public class quickSort {

    static int iPartition(int arr[],int l,int h){
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<h;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        
        
        return i+1;
    }
    static void qSort(int arr[],int l,int h){
        if(l<h){
            int pivot=iPartition(arr, l, h);
            qSort(arr, l, pivot-1);
            qSort(arr,pivot+1,h);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,1,3,5,6,7};
        int n =arr.length;
        qSort(arr, 0, n-1);
        for(int i : arr){
            System.out.print(arr[i]+ " ");
        }
        
    }
    
}

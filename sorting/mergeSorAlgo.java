public class mergeSorAlgo {


    static void merge(int arr[],int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[i+low];
            
        } 
        for(int i=0;i<n2;i++){
            right[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=low;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }





    }


static void mergeSort(int arr[],int left ,int right){
    if(right>left){
        int mid=left+(right-left)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr, left, mid, right);

    }
}


    public static void main(String[] args) {

        int arr[]={1,2,87,6,53,68,575,6345,67};
        mergeSort(arr, 0, arr.length-1);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        
    }
}

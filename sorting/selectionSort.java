public class selectionSort {
    public static void main(String[] args) {
        int arr[]={1,2,3,65,4,53,5,3,34};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
              

            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
             }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

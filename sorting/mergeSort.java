public class mergeSort {
    //optimised solution
    public static void main(String[] args) {

        int a1[]={1,2,3,4,5,6};
        int a2[]={4,4,5,6,7,9};

        int m=a1.length;
        int n=a2.length;

        int i=0,j=0;
        while(i<m && j<n){
            if(a1[i]<=a2[j]){
                System.out.print(a1[i]+" ");
                i++;
            }else{
                System.out.print(a2[j]+" ");
                j++;
            }
        }

        while(i<m){
            System.out.print(a1[i]+" ");
            i++;
        }
        while(j<n){
            System.out.print(a2[j]+" ");
            j++;
        }




        
    }
}

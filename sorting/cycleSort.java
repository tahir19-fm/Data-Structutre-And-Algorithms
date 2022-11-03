public class cycleSort {
    


    public static void main(String[] args) {

        int arr[]={2, 3, 4, 5, 6};
        int n=arr.length;
        int swap =0;


        for(int cs=0;cs<n-1;cs++){
            int item=arr[cs];
            int pos=cs;
            for(int i=cs+1;i<n;i++){
                if(arr[i]<item){
                    pos++;
                    
                }}
               
                int temp=arr[pos];
                arr[pos]=item;
                item=temp;
                while(pos!=cs){
                    pos=cs;
                    for(int i=cs+1;i<n;i++){
                    if(arr[i]<item){
                        pos++;
                    }
                    }
                    swap++;
                    int remp=arr[pos];
                    arr[pos]=item;
                    item=remp;
                }
            }


            for(int x : arr){
                System.out.print(x+" ");
            }
            System.out.println();
            System.out.println(swap);
        }
        
    }
    


public class MInGrpFlips {
    public static void main(String[] args) {
        boolean arr[]={true,false,false,false,true,false,false,true,true,true,true};
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                if(arr[i]!=arr[0]){
                    System.out.print("from "+i+" to ");
                }else{
                    System.out.println(i-1);
                }
            }

        }
        if(arr[n-1]!=arr[0]){
            System.out.println(n-1);
        }
    }
}

public class LEADERS {
    public static void main(String[] args) {
        int[] arr = {10,3,4,6,5,7,8};
        int curldr=arr[arr.length-1];
        System.out.print(curldr+" ");
        for(int i=arr.length-2;i>=0;i--){
            if(curldr<arr[i]){
                curldr=arr[i];
                System.out.print(curldr+" ");
            }
        }

        
    }
    
}

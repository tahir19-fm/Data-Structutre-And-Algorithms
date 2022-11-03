public class longestComSUb {
    static int longSub(int arr1[],int arr2[]){
        int temp[]=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            temp[i]=arr1[i]-arr2[i];
        }
        return longestSubSum.longest(temp, 0);
    }
    public static void main(String[] args) {
        int arr1[]={0,1,0,0,0,0};
        int arr2[]={1,0,1,0,0,1};
        System.out.println(longSub(arr1, arr2));
    }
}

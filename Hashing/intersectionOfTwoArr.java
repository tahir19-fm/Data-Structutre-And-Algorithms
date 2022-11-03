import java.util.HashSet;

public class intersectionOfTwoArr {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        int arr1[]={10,15,20,30,80};
        int arr2[]={30,5,30,80};
        int res=0;
        for(int x:arr1){
            h.add(x);
        }
        for(int x:arr2){
            if(h.contains(x)){
                res++;
                h.remove(x);
            }
        }
        System.out.println(res);
    }
}

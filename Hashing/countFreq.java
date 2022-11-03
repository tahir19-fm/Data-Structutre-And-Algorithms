import java.util.HashMap;

public class countFreq {
    public static void main(String[] args) {
        int arr[]={10,12,10,15,10,20,12,12};
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int x:arr){
            h.put(x, h.getOrDefault(x,0)+1);
        }
        System.out.println(h);
    }
}

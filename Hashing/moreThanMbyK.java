import java.util.HashMap;
import java.util.Map;

public class moreThanMbyK {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,4,4,4,5};
        int n=arr.length;
        int k=7;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int x:arr){
            m.put(x,m.getOrDefault(x, 0)+1);
        }
        for(Map.Entry<Integer, Integer> e:m.entrySet()){
            if(e.getValue()>n/k){
                System.out.print(e.getKey()+" ");
            }
        }
    }
}

import java.util.HashMap;
import java.util.Map;

public class hasnmap {
    public static void main(String[] args) {
        HashMap<String,Integer> m =new HashMap<>();
        m.put("nunnu", 23);
        m.put("munnu", 32);
        System.out.println(m);
        System.out.println(m.size());
        for(Map.Entry<String,Integer> e: m.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}




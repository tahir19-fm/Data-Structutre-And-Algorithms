import java.util.ArrayList;
import java.util.LinkedList;

class MyHash{
    int bucket;
    ArrayList<LinkedList<Integer>> table;
    MyHash(int b){
        bucket=b;
        table=new ArrayList<LinkedList<Integer>>();
        for(int i=0;i<b;i++){
            table.add(new LinkedList<Integer>());
        }

    }
    void insert(Integer k){
        int i=k%bucket;
        table.get(i).add(k);
    }
    boolean search(Integer k){
        int i=k%bucket;
        return table.get(i).contains(k);
    }
    void delete(Integer k){
        int i=k%bucket;
        table.get(i).remove(k);
    }
}


public class HashTable {
    public static void main(String[] args) {
        MyHash mh=new MyHash(7);
        mh.insert(12);
        mh.insert(13);
        mh.insert(14);
        mh.insert(15);
        System.out.println(mh.search(12));
        mh.delete(13);
        System.out.println(mh.search(13));
        
    }
}

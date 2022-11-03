import java.util.HashSet;

class hashSet{
    public static void main(String[] args) {
        
        HashSet<Integer> s=new HashSet<>();
        s.add(5);
        s.add(10);
        System.out.println(s);
        if(s.contains(10)){
            System.out.println("present");
        }else{
            System.out.println("not present");
        }
        s.remove(10);
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}
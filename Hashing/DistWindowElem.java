import java.util.HashMap;

public class DistWindowElem {
    static void printDis(int arr[],int k){
        int n=arr.length;
        HashMap<Integer, Integer> m=new HashMap<>(); 
       
        for (int i = 0; i < k; i++) { 
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1); 
        } 
       
        System.out.print(m.size()+" "); 
       
        for (int i = k; i < n; i++) { 
            
            m.put(arr[i - k],  m.get(arr[i - k]) - 1);
            
            if (m.get(arr[i - k]) == 0) { 
                m.remove(arr[i-k]); 
            }   
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
            
            System.out.print(m.size()+" "); 
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,20,10,30,40,10};
        int k=4;
       printDis(arr, k);
    }
}


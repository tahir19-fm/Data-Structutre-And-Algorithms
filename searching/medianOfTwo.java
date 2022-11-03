import javax.lang.model.element.Element;

public class medianOfTwo {
    static double median(int arr1[],int arr2[],int m,int n) {
        if(m>n)
            return median(arr2,arr1,n,m);//ensuring that binary search happens on minimum size array
            
        int low=0,high=m,medianPos=((m+n)+1)/2;
        while(low<=high) {
            int cut1 = (low+high)/2;
            int cut2 = medianPos - cut1;
            
            int l1 = (cut1 == 0)? Integer.MIN_VALUE:arr1[cut1-1];
            int l2 = (cut2 == 0)? Integer.MIN_VALUE:arr2[cut2-1];
            int r1 = (cut1 == m)? Integer.MAX_VALUE:arr1[cut1];
            int r2 = (cut2 == n)? Integer.MAX_VALUE:arr2[cut2];
            
            if(l1<=r2 && l2<=r1) {
                if((m+n)%2 != 0)
                    return Math.max(l1,l2);
                else 
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
            }
            else if(l1>r2) high = cut1-1;
            else low = cut1+1;
        }
        return 0.0;
    }
    
    public static void main(String[] args) {
        int arr1[]={2,3,4};
        int arr2[]={4,5,6,7};
        System.out.println(median(arr1, arr2, arr1.length, arr2.length)); 
        
    }
}

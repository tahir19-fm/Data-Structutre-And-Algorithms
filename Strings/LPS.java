public class LPS {

    static void fillLps(String str ,int lps[]){
        int n= str.length(),len=0;
        lps[0]=0;
        int i=1;
        while(i<n){
            if(str.charAt(i)==str.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len==0){
                    lps[i]=0;
                    i++;
                }else{
                    len=lps[len-1];
                }
            }
        }
    }
    public static void main(String[] args) {
        String str="ababc";
        int []lps=new int[str.length()];
        fillLps(str, lps);
        for(int i:lps){
            System.out.print(i+", "); 
        }
    }
}

import javax.print.FlavorException;
import javax.print.DocFlavor.STRING;

public class RabinKarpAlgo {
static final int d=256;
static final int q=101;
static void RBSearch(String pat,String txt,int M,int N){

//compute d^(M-1)%q
int h=1;
for(int i=1;i<=M-1;i++){
    h=(h*d)%q;
}
//compute P and T
int p=0,t=0;
for(int i=0;i<M;i++){
    p=(p*d+pat.charAt(i))%q;
    t=(t*d+txt.charAt(i))%q;
}
for(int i=0;i<=N-M;i++){
    //check for hit
    if(p==t){
        boolean flag=true;
        for(int j=0;j<M;j++){
        if(txt.charAt(i+j)!=pat.charAt(j)){
            flag=false;
            break;
        }
        }
        if(flag==true)
        {
            System.out.print(i+" ");
        }
    }

//compute t+1 using t
if(i<N-M){
    t=((d*(t-txt.charAt(i)*h))+txt.charAt(i+M))%q;
    
}
if(t<0){
    t=t+q;
}
}
}

    public static void main(String[] args) {
        String txt="AAAAA";
        String pat="AAA";
      RBSearch(pat, txt, pat.length(),txt.length());
    }
}

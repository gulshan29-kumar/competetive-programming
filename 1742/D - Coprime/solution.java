import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int arr[]=new int[a];
            for(int i=0;i<a;i++) arr[i]=in.nextInt();
            int arridx[]=new int[1001];
            Arrays.fill(arridx,-1);
            for(int i=0;i<a;i++){
                arridx[arr[i]]=i;
            }
            int ans=-1;
            for(int i=0;i<1001;i++){
                for(int j=i;j<1001;j++){
                    if(gcd((long)(i),(long)(a=j) )==1&&arridx[i]!=-1&&arridx[j]!=-1) ans=Math.max(ans,arridx[i]+arridx[j]+2);
                }
                            }
            System.out.println(ans);
        }
    }
    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
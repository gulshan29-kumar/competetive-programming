import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
          long a=in.nextLong();
          long b=in.nextLong();
          int a1=4;
          long ans=0;
          while(a1-->0){
              int d=in.nextInt();
              int first=0;int last=0;
              for(int i=0;i<d;i++){
                  int c=in.nextInt();
                  if(i==0) first=c;
                  if(i==d-1) last=c;
              }
              if(a1>=2) ans=Math.max(ans,(long)(last-first)*b);
              else ans=Math.max(ans,(long)(last-first)*a);
          }
            System.out.println(ans);
        }
    }
}
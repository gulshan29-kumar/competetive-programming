import java.util.*;
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
          int a=in.nextInt();
          int b=in.nextInt();
          int min=Integer.MAX_VALUE;
          int bool=0;
          int ans =0;
          for(int i=0;i<a;i++){
              for(int j=0;j<b;j++){
                  int c=in.nextInt();
                  if(c<0) bool++;
                  ans+=Math.abs(c);
                  min=Math.min(min,Math.abs(c));
              }
          }
           if(bool%2!=0) System.out.println(ans-2*min);
           else System.out.println(ans);
        }
     }
}
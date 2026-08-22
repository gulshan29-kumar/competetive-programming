import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        int a=in.nextInt();
        long c=in.nextLong();
        a--;long u=-2;long v=-1; long ans=1;
        while(a-->0){
            long d=in.nextLong();
            if(d>c) v=1;
            else if(d<c) v=-1;
            else continue;
            if(u!=v) ans++;
            u=v;c=d;
 
        }
            System.out.println(ans);
 
 
        }
    }
}
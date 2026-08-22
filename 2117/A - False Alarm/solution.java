import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a=in.nextInt();
            int b=in.nextInt();
            int k=-1;
            int j=-1;
            for(int i=1;i<=a;i++){
                int c=in.nextInt();
                if(k==-1&&c==1) k=i;
                if(c==1) j=i;
            }
            if(j-k+1<=b) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
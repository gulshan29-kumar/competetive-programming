import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            int d=in.nextInt();
            int e=d*(a/c);
            if(a%c==0) {
                if(b==e) System.out.println("Yes");
                else System.out.println("No");
            }
            else System.out.println("Yes");
 
        }
    }
}
import java.util.*;
 
public class question{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            float d=c%(b+a);
            if(d+0.5-a>0) System.out.println("Yes");
            else System.out.println("NO");
           }
        }
    }
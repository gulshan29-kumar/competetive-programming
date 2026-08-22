import java.util.*;
public class question{
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int t=in.nextInt();
       while(t-->0){
           int a=in.nextInt();
           int b=in.nextInt();
           if(a+1>=b&&(a-b+1)%9==0) System.out.println("Yes");
           else System.out.println("NO");
       }
    }
}
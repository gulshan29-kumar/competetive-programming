import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            long a=in.nextLong();
            long b=in.nextLong();
            b--;
            if(a%2==0) System.out.println(b%a+1);
            else{
                long val=a/2;
                System.out.println((b+(b/val))%a+1);
            }
 
        }
    }
}
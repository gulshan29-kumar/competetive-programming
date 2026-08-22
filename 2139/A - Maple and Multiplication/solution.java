import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int boo=0;
            if(a%b==0||b%a==0) boo=1;
            if(a==b) System.out.println(0);
            else if(boo==1) System.out.println(1);
            else System.out.println(2);
        }
    }
}
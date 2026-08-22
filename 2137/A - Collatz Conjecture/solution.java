import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            while(a-->0){
                b*=2;
            }
            System.out.println(b);
        }
    }
}
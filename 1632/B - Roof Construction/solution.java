import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a=in.nextInt();
            int req=(int)(Math.log(a-1)/Math.log(2));
            req=(int)Math.pow(2,req);
            for(int i=1;i<a;i++){
                if(i>=req){
                    if(i==req) System.out.print(0+" ");
                    System.out.print(i+" ");
                }
               else  System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
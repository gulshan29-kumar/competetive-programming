import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a=in.nextInt();
           for(int i=2;i<=a;i++){
               System.out.print(i+" ");
           }
            System.out.print(1+" ");
            System.out.println();
        }
    }
}
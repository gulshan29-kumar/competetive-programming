import java.util.*;
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
         long a=in.nextLong();
         long b=in.nextLong();
         long c=in.nextLong();
          System.out.println(((b+1)*c+a-3)/(a-1)+c);
        }
     }
}
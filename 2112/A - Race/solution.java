import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            if(Math.min(b,c)<=a&&a<=Math.max(b,c)) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}
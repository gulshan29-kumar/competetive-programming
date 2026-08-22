import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int red=in.nextInt();
            int blue=in.nextInt();
            if(((n-red)%2==0&&blue%2==n%2)||((n-blue)%2==0 &&blue>=red))
                System.out.println("Yes");
 
            else System.out.println("No");
        }
 
    }
}
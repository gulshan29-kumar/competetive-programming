import java.util.*;
public class qwe{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int d= Integer.parseInt(in.next());
            if(Math.sqrt(d)==(int)Math.sqrt(d)) System.out.println((int)Math.sqrt(d)+" "+0);
            else System.out.println(-1);
        }
    }
}
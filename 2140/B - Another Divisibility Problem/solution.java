import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            if(x%2==0) System.out.println(x/2);
            else System.out.println(x*2);
 
        }
    }
}
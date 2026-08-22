import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
   public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            System.out.println(a-a/b);
        }
    }
}
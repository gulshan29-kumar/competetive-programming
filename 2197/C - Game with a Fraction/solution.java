import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        while(t-- > 0){
            long a = in.nextLong();
            long b = in.nextLong();
            
            if(a >= b){
                System.out.println("Alice");
                continue;
            }
            
            long d = b - a;
            
            if(a >= 2*d && b >= 3*d)
                System.out.println("Bob");
            else
                System.out.println("Alice");
        }
    }
}
import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main // Note: Codeforces requires the class name to be 'Main'
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        if (!in.hasNextInt()) return;
        
        int t = in.nextInt();
        
        // FIX 4: Use StringBuilder for fast appending
        StringBuilder ans = new StringBuilder(); 
        
        while(t-- > 0){
            String str = in.next();
            long len = str.length();
            
            // FIX 2: Read 'a' as a long to handle up to 5 * 10^11
            long a = in.nextLong(); 
            
            // Your math is perfect here
            int iter = (int)Math.ceil(((double)((2.0 * len + 1) - Math.sqrt((2.0 * len + 1) * (2.0 * len + 1) - 8.0 * a)) / 2.0)) - 1;
            int req = (int)(a - (long)iter * (2L * len + (iter - 1) * -1) / 2);
            
            char stack[] = new char[(int)len];
            int top = 0;
            
            for(int i = 0; i < len; i++){
                char ch = str.charAt(i);
                
                // FIX 1: Changed 'if' to 'while' to remove all necessary preceding characters
                while(top > 0 && iter > 0 && stack[top - 1] > ch){
                    top--;
                    iter--;
                }
                stack[top++] = ch;
            }
            
            // FIX 3: If we still need to remove characters (e.g. string was already sorted), drop them from the end
            top -= iter;
            
            ans.append(stack[req - 1]);
        }
        
        System.out.println(ans.toString());
    }
}
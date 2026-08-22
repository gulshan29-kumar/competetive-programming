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
            int n = in.nextInt();
            Map<Integer,Integer> map = new HashMap<>();
 
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    int c = in.nextInt();
                    map.put(c, map.getOrDefault(c, 0) + 1);
                }
            }
 
            int req = n * (n - 1);
            boolean bool = true;
 
            for(int it : map.keySet()){
                if(map.get(it) > req){
                    bool = false;
                    break;
                }
            }
 
            if(!bool) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}
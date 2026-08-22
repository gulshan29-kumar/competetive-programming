import org.w3c.dom.ls.LSOutput;
 
import java.util.*;
import java.io.*;
 
public class qwe {
    public static void main(String[] args) {
 
 
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<t;i++){
            int c=in.nextInt();
            min=Math.min(min,Math.abs(c));
        }
        System.out.println(min);
    }
}
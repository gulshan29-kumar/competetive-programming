import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            if(a%2!=0) System.out.println(0);
            else System.out.println(a/4+1);
        }
    }
}
 
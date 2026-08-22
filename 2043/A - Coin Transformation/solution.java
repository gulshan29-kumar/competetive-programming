import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        for(int i=0;i<x;i++){
 
            long a = in.nextLong();
            int count=1;
           while(a>3){
               a=a/4;
               count*=2;
           }
 
           System.out.println(count);
        }
    }
}
 
 
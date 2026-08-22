import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a= in.nextInt();
            String str=in.next();
            int count0=0;
            int i=0;
            for(int j=i;j<a;j++){
                if(str.charAt(j)=='0') count0++;
            }
            int count02=0;
            for(int j=count0;j<a;j++){
                if(str.charAt(j)=='0') count02++;
            }
            System.out.println(count02);
        }
    }
 
 
 
 
}
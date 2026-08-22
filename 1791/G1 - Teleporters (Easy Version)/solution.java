import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            long b=in.nextLong();
            long arr[]=new long[a];
            for(int i=0;i<a;i++) arr[i]=i+1+in.nextLong();
            Arrays.sort(arr);
            int count=0;
            int i=0;
            while(b>=0&&i<a){
                count++;
                b=b-arr[i++];
            }
           if(b>=0) System.out.println(count);
           else System.out.println(count-1);
 
        }
    }
}
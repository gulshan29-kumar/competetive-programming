import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            long b =in.nextLong();
            long arr[]=new long[a];
            for(int i=0;i<a;i++) arr[i]=in.nextLong();
            long ans=0;
            int min=0;
            int max=0;
            for(int i=0;i<a;i++){
                if(b-1-arr[i]>=0) min++;
                if(arr[i]-(b+1)>=0) max++;
            }
            if(min>max) ans=b-1;
            else ans=b+1;
            System.out.println(ans);
        }
    }
}
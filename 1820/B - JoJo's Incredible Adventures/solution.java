import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        int  t=in.nextInt();
        while(t-->0){
            String str=in.next();
            int count1=0;
            int count=0;
            int strpos=-1;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='1') count++;
                else{
                    count1=Math.max(count,count1);
                    if(strpos==-1) strpos=i;
                    count=0;
                }
            }
            if(strpos==-1){
                long ans=str.length();
                System.out.println(ans*ans);continue;
            }
            count1=Math.max(count+strpos,count1);
            long ans=0;
            for(int i=1;i<=count1;i++){
                ans=Math.max(i*(count1-i+1L),ans);
            }
            System.out.println(ans);
        }
    }
}
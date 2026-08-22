import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
           String str=in.next();
 
           int cntleft=0;
           int cntrigh=0;
           int bool=1;
           for(int i=0;i<str.length();i++){
               if(str.charAt(i)=='>') cntrigh++;
               else if(str.charAt(i)=='<') cntleft++;
               else {
                   cntleft++;
                   cntrigh++;
               }
               if(i>0&&str.charAt(i)=='*'&&str.charAt(i-1)=='>'){
                   bool=0;
                   break;
               }
               if(i>0&&str.charAt(i)=='<'&&str.charAt(i-1)=='*'){
                   bool=0;
                   break;
               }
               if(i>0&&str.charAt(i)=='<'&&str.charAt(i-1)=='>'){
                   bool=0;
                   break;
               }
               if(i>0&&str.charAt(i)=='*'&&str.charAt(i-1)=='*'){
                   bool=0;
                   break;
               }
           }
           if(bool==0) {
               System.out.println(-1);
           }
           else System.out.println(Math.max(cntleft,cntrigh));
        }
    }
}
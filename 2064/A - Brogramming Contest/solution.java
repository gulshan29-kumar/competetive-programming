import java.util.*;
public class qwe{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
          int  a=in.nextInt();
          String str=in.next();
          int max1=0;
          int noof1=0;
          int ans=0;
          for(int i=0;i<a;i++){
              if(i<a-1&&str.charAt(i)!=str.charAt(i+1)) max1++;
              if(str.charAt(i)=='1') noof1++;
 
          }
          if(noof1>0&&str.charAt(0)=='1') max1++;
 
          if(noof1==a) System.out.println(1);
          else if(noof1==0) System.out.println(0);
          else System.out.println(max1);
 
        }
    }
}
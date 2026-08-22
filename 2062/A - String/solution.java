import java.util.*;
public class question{
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int t=in.nextInt();
     while(t-->0){
      String str=in.next();
      int sum=0;
      for(int i=0;i<str.length();i++)
         if(str.charAt(i)=='1') sum++;
 
     System.out.println(sum);
     }
      }
 
}
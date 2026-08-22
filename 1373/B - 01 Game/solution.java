import java.util.*;
public class qwe {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt();
      while(t-->0){
          String  str=in.next();
          int count=0;
          for(int i=0;i<str.length();i++){
              if(str.charAt(i)=='0') count++;
          }
          count=Math.min(count,str.length()-count);
          if(count%2==0) System.out.println("NET");
          else System.out.println("DA");
      }
    }
}
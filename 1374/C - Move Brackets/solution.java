import java.util.*;
public class qwe {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt();
      while(t-->0){
          int a=in.nextInt();
          String str=in.next();
          int closed=0;
          int open=0;
          int count=0;
          for(int i=0;i<a;i++){
              if(str.charAt(i)=='(') open++;
              else closed++;
              if(closed>open){
                  count++;
                  closed--;
              }
          }
          System.out.println(count);
 
      }
    }
}
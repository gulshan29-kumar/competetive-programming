import java.util.*;
public class god{
    public static void main(String[] args) {
      Scanner in =new Scanner(System.in);
      int t=in.nextInt();
      String arr[]=new String[t];
      for(int i=0;i<t;i++){
          arr[i]=in.next();
      }
      int x=0;
      for(int i=0;i<t;i++){
          if (arr[i].equals("X++")||arr[i].equals("++X")) x++;
          else x--;
      }
        System.out.println(x);
    }
}
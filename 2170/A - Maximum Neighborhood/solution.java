import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt();
      while(t-->0){
       int a=in.nextInt();
          if(a>2) System.out.println(Math.max(4*a*a-a-4,5*a*a-5*a-5));
          else{
              if(a==1) System.out.println(1);
              else System.out.println(9);
          }
      }
    }
}
import java.util.*;
 
public class question {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0) {
            int a=in.nextInt();
            int b=in.nextInt();
            String str1=in.next();
            String str2=in.next();
          int ans=-1;
          for(int i=0;i<10;i++){
              if(str1.contains(str2)) {
                  ans=i;
                  break;
              }
              str1=str1+str1;
          }
            System.out.println(ans);
 
 
        }
 
    }
}
 
import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      long b=in.nextLong();
      int arr[]=new int[a];
      for(int i=0;i<a;i++){
          arr[i]=in.nextInt();
      }
      Arrays.sort(arr);
      int maxlen=0;
      int ans=0;
      for(int i=a-1;i>=0;i--) {
          int d = (int) (b / arr[i]) + 1;
          if (maxlen + d > a) break;
          else {
              maxlen += d;
              ans++;
          }
      }
        System.out.println(ans);
    }
}
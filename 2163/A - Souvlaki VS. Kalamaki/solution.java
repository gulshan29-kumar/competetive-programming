import java.util.*;
public class qwe {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt();
      while(t-->0){
          int a=in.nextInt();
          int arr[]=new int[a];
          for(int i=0;i<a;i++) arr[i]=in.nextInt();
          Arrays.sort(arr);
          int bool=0;
          for(int i=1;i<a-1;i++){
              if(i%2!=0&&arr[i]!=arr[i+1]){
                  bool=1;
                  break;
              }
          }
          if(bool==1) System.out.println("No");
          else System.out.println("Yes");
      }
    }
}
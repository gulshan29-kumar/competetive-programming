import java.util.*;
public class qwe {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt();
      while(t-->0){
          int a=in.nextInt();
          int arr[]= new int[a];
          int count=0;
          for(int i=0;i<a;i++) {
              arr[i]=in.nextInt();
              if(arr[i]==1) count++;
          }
          if(count==0){
              System.out.println("No");
              continue;
          }
 
          Arrays.sort(arr);
          long sum=1;
          int bool=0;
          for(int i=1;i<a;i++) {
              if(sum<arr[i]){
                  bool=1;break;
              }
              sum+=arr[i];
          }
          if(bool==1) System.out.println("No");
          else System.out.println("Yes");
 
      }
    }
}
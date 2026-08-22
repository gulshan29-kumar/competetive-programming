import java.util.*;
public class qwe {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt();
      while(t-->0){
          int a=in.nextInt();
          long arr[]= new long[a];
          for(int i=0;i<a;i++) arr[i]=in.nextInt();
          int count0=0;
          int count1=0;
          for(int i=0;i<a;i++){
              if(arr[i]==0) count0++;
              if(arr[i]==1) count1++;
 
          }
          long ans=(long) Math.pow(2,count0)*count1;
          System.out.println(ans);
 
      }
    }
}
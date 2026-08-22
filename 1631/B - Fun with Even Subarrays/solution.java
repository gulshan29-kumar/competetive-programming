import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
          int a=in.nextInt();
          int arr[]=new int[a];
          for(int i=0;i<a;i++) arr[i]=in.nextInt();
          int j=a-2;
          int store=arr[a-1];
          int count=0;
          while(j>=0){
              if(arr[j]==store) j--;
              else {
                  count++;
                  j=j-(a-1-j);
 
              }
          }
            System.out.println(count);
 
        }
    }
}
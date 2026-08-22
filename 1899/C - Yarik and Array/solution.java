import java.util.*;
import java.lang.*;
import java.io.*;
 
// NAME = GULSHAN KUMAR : SECTION-B : ROLL NO = 2024ug1107
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
          int a=in.nextInt();
          int arr[]=new int[a];
          for(int i=0;i<a;i++){
              arr[i]=in.nextInt();
          }
          int sum=arr[0];
          int max=arr[0];
          for(int i=1;i<a;i++){
              int c=arr[i];
              int d=arr[i-1];
              if(c<0) c=-1*c;
              if(d<0) d=-1*d;
              if(c%2!=d%2&&sum>=0){
                  sum+=arr[i];
              }
              else sum=arr[i];
              max=Math.max(max,sum);
 
          }
            System.out.println(max);
        }
    }
}
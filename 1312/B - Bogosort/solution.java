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
        for(int i=a-1;i>=0;i--) System.out.print(arr[i]+" ");
          System.out.println();
    }
}}
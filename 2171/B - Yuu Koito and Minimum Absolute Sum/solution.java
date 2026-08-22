import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int arr[]=new int[a];
            int min=Integer.MAX_VALUE;
            for(int i=0;i<a;i++) arr[i]=in.nextInt();
            if(arr[0]==-1&&arr[a-1]!=-1) {
                arr[0]=arr[a-1];min=0;
            }
            if(arr[0]!=-1&&arr[a-1]==-1) {
                arr[a-1]=arr[0];min=0;
            }
            min=Math.min(min,Math.abs(arr[a-1]-arr[0]));
            System.out.println(min);
            for(int i=0;i<a;i++){
                if(arr[i]==-1) System.out.print(0+" ");
                else System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
 
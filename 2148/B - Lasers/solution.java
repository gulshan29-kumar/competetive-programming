import java.util.*;
import java.lang.*;
import java.io.*;
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            int d=in.nextInt();
            int arr[]=new int[a];
            int arr1[]=new int[b];
            for(int i=0;i<a;i++){
                arr[i]=in.nextInt();
            }
            for(int i=0;i<b;i++){
                arr1[i]=in.nextInt();
            }
            System.out.println(a+b);
        }
    }
 
}
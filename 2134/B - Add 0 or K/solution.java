import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
           long b=in.nextLong();
           long arr1[]=new long[a];
            long arr2[]=new long[a];
           for(int i=0;i<a;i++){
               arr1[i]=in.nextLong();
           }
           for(int i=0;i<a;i++){
               long n=arr1[i]%(b+1);
               arr2[i]=arr1[i]+n*b;
           }
           for(long it:arr2){
               System.out.print(it+" ");
           }
            System.out.println();
        }
 
    }
}
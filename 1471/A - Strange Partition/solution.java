import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
           int a=in.nextInt();
           long b=in.nextLong();
           long sum1=0;
           long sum=0;
           long arr[]=new long[a];
           for(int i=0;i<a;i++){
               long c=in.nextLong();
               arr[i]=c%b;
               sum+=(c+b-1)/b;
               sum1+=c;
           }
           System.out.println((sum1+b-1)/b+" "+(sum));
        }
    }
 
}
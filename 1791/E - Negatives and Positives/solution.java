import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            long arr[]=new long[a];
            long sum=0;
            int cntneg=0;
            long min=Long.MAX_VALUE;
            for(int i=0;i<a;i++) {
                arr[i]=in.nextLong();
                sum+=Math.abs(arr[i]);
                if(arr[i]<0) cntneg++;
                min=Math.min(Math.abs(arr[i]),min);
            }
            if(cntneg%2==0) System.out.println(sum);
            else System.out.println(sum-2*min);
        }
    }
}
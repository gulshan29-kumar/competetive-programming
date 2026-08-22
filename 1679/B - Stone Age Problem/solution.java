import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
            int a=in.nextInt();
            int q=in.nextInt();
            long arr[]=new long[a];
            long sum=0;
            for(int i=0;i<a;i++) {
                arr[i]=in.nextLong();
                sum+=arr[i];
            }
           long prev=-1;
            int arrb[]=new int[a];
            long t=-1;
            for(int i=0;i<q;i++){
                int c=in.nextInt();
                if(c==1){
                    int k=in.nextInt();
                    long x=in.nextLong();
                    if(arrb[k-1]>t) sum=sum+x-arr[k-1];
                    else sum=sum+x-prev;
                    System.out.println(sum);
                    arrb[k-1]=i;arr[k-1]=x;
                }
                else {
                    long x=in.nextLong();
                    t=i;
                    sum = x * a;
                    prev=x;
                    System.out.println(sum);
                }
            }
 
    }
}
import java.util.*;
 
public class question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of test cases
 
        while (t--> 0) {
           int a=in.nextInt();
           int b=in.nextInt();
           long x=in.nextLong();
           long c=(long)a*b;
           long arr[]=new long[a];
           long  count=0;
           long sum=0;
           for(int i=0;i<a;i++){
               arr[i]=in.nextLong();
               sum+=arr[i];
           }
           long req=x%sum;
           count=(x/sum)*a;
           for(int i=a-1;i>=0;i--){
               if(req<=0){
                   break;
               }
               req-=arr[i]; count++;
           }
            if(count>c) System.out.println(0);
            else System.out.println(c-count+1);
        }
    }
}
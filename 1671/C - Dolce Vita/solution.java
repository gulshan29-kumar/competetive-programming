import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            long b=in.nextLong();
            long arr[]=new long[a];
            long sum=0;
            for(int i=0;i<a;i++) {
                arr[i] = in.nextLong();
                sum += arr[i];
            }
            Arrays.sort(arr);
            long ans=0;
            long prevday=-1;
           for(int i=a-1;i>=0;i--){
               long currday=b-sum>=0?(b-sum)/(i+1):-1;
               ans+=(long)(i+1)*(currday-prevday);
               prevday=currday;
               sum-=arr[i];
           }
            System.out.println(ans);
 
        }
    }
}
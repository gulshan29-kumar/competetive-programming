import java.util.*;
import java.io.*;
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            long b=in.nextLong();
            long arr[]=new long[a];
            for(int i=0;i<a;i++){
                arr[i]=in.nextLong();
            }
            Arrays.sort(arr);
            long prev=arr[0];
            long ans=0;
            for(int i=1;i<a;i++){
                ans+=(arr[i]-arr[i-1])*i;
                if(ans==b){
                    prev=arr[i];
                    break;
                }
                if(ans>b){
                    long right=arr[i];
                    long left=arr[i-1];
                    long temp=ans-(arr[i]-arr[i-1])*i;
                    while(left<=right){
                        long mid=(right+left)/2;
                        if(temp+(mid-arr[i-1])*i<=b){
                            prev=mid;
                            left=mid+1;
                        }
                        else right=mid-1;
                    }
                    ans=b;
                    break;
                }
                prev=arr[i];
            }
            if(ans<b&&prev==arr[a-1]){
               prev+=(b-ans)/a;
            }
            System.out.println(prev);
        }
    }
}
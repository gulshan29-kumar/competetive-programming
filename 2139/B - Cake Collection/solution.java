import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0) {
        int a=in.nextInt();
        long b=in.nextLong();
        long arr[]=new long[a];
        for(int i=0;i<a;i++){
            arr[i]=in.nextLong();
        }
        Arrays.sort(arr);
        if(b>a){
            long c=b-a+1;
            long ans=0;
            for(int i=0;i<a;i++){
                ans+=arr[i]*(c++);
            }
            System.out.println(ans);
        }
        else {
            long c=1;
            long ans=0;
            for(int i=a-(int)b;i<a;i++){
                ans+=arr[i]*(c++);
            }
            System.out.println(ans);
 
        }
        }
    }
}
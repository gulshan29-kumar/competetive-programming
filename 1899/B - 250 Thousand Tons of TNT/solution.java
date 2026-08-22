import java.util.*;
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            long arr[]=new long[a];
            for(int i=0;i<a;i++){
                arr[i]=in.nextLong();
            }
            ArrayList<Integer> arr2 =new ArrayList<>();
            int b=a;
            for(int i=1;i*i<=b;i++){
                if(a%i==0) {
                    arr2.add(i);
                    arr2.add(a/i);
                }
            }
            long maxsum= Long.MIN_VALUE;
            long minsum=Long.MAX_VALUE;
            long ans=0;
            for(int i = 0; i< arr2.size(); i++){
                long sum=0;
                for(int j=0;j<a;j++){
                    sum+=arr[j];
                    if((j+1)%arr2.get(i)==0) {
                        maxsum=Math.max(maxsum,sum);
                        minsum=Math.min(minsum,sum);
                        sum=0;
                    }
                }
                ans=Math.max(ans,maxsum-minsum);
                maxsum= Long.MIN_VALUE;
                minsum=Long.MAX_VALUE;
            }
            System.out.println(ans);
 
        }
    }
}
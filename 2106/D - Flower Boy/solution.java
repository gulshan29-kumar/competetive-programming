import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            long[] arr1=new long[a];
            long[] arr2=new long[b];
            for(int i=0;i<a;i++) arr1[i]=in.nextLong();
            for(int i=0;i<b;i++) arr2[i]=in.nextLong();
 
            int[] prefix=new int[b];
            int[] sufix=new int[b];
 
            int j=0;
            for(int i=0;i<a;i++){
                if(j<b && arr1[i]>=arr2[j]){
                    prefix[j++]=i;
                }
            }
            while(j<b) prefix[j++]=-1;
            j=b-1;
            for(int i=a-1;i>=0;i--) {
                if (j >= 0 && arr1[i] >= arr2[j]) {
                    sufix[j] = i;
                    j--;
                }
            }
            while(j>=0){
                sufix[j] = -1;
                j--;
            }
            long ans = Integer.MAX_VALUE;
 
            for(int i=1;i<b-1;i++){
                if(prefix[i-1]!=-1 && sufix[i+1]!=-1 && prefix[i-1]<sufix[i+1]){
                    ans = Math.min(ans, arr2[i]);
                }
            }
            if(b>1 && sufix[1]!=-1){
                ans = Math.min(ans, arr2[0]);
            }
            if(b>1 && prefix[b-2]!=-1){
                ans = Math.min(ans, arr2[b-1]);
            }
            int bool=0;
            for(int i=0;i<b;i++){
                if(prefix[i]!=-1) bool++;
            }
            if(bool==b) System.out.println(0);
           else if(ans==Integer.MAX_VALUE&&b==1) System.out.println(arr2[b-1]);
            else if(ans==Integer.MAX_VALUE){
                System.out.println(-1);
            } else {
                System.out.println(ans);
            }
        }
    }
}
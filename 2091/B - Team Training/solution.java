import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int arr[]=new int[a];
            for(int i=0;i<a;i++){
                arr[i]=in.nextInt();
            }
            Arrays.sort(arr);
            int sum=arr[0];
            int k=0;
            int ans=0;
            for(int i=a-1;i>=0;i--) {
                sum=Math.min(sum,arr[i]);
                k++;
                if(sum*k<=arr[i]){
                    sum=arr[i];
                    k=1;
                }
                if(sum*k>=b){
                    ans++;
                    sum=Integer.MAX_VALUE;
                    k=0;
                }
            }
            System.out.println(ans);
        }
    }
}
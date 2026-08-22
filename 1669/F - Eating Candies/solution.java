import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int arr[]=new int[a];
            for(int i=0;i<a;i++) arr[i]=in.nextInt();
            int i=0;int j=a-1;
            int ans=0;
            int left=0;int right=0;
            while(i<=j){
                if(left>right){
                    right+=arr[j--];
                }
                else left+=arr[i++];
                if(left==right){
                    ans=Math.max(ans,i+a-j-1);
                }
            }
            System.out.println(ans);
        }
    }
}
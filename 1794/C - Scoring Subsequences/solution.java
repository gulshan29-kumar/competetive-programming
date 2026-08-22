import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int arr[]=new int[a];
            for(int i=0;i<a;i++) arr[i]=in.nextInt();
            for(int i=0;i<a;i++){
                int left=0;
                int right=i;
                int ans=i;
                while(left<right){
                    int  mid=(left+right)/2;
                    if(arr[mid]>=i-mid+1){
                        ans=mid;
                        right=mid;
                    }
                    else if(arr[mid]<i-mid+1) left=mid+1;
                    else break;
                }
                System.out.print((i-ans+1)+" ");
            }
            System.out.println();
 
        }
    }
}
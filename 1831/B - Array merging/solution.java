import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int arr1[]=new int[a];
            int arr2[]=new int[a];
            for(int i=0;i<a;i++){
                arr1[i]=in.nextInt();
            }
            for(int i=0;i<a;i++) arr2[i]=in.nextInt();
            int count=1;
            int arr3[]=new int[2*a+1];
            Arrays.fill(arr3,0);
            int arr4[]=new int[2*a+1];
            Arrays.fill(arr4,0);
 
            for(int i=1;i<a;i++){
                if(arr1[i]!=arr1[i-1]){
                    arr3[arr1[i-1]]=Math.max(arr3[arr1[i-1]],count);
                    count=1;
                }
                else count++;
            }
            arr3[arr1[a-1]]=Math.max(arr3[arr1[a-1]],count);
            count=1;
            for(int i=1;i<a;i++){
                if(arr2[i]!=arr2[i-1]){
                    arr4[arr2[i-1]]=Math.max(arr4[arr2[i-1]],count);
                    count=1;
                }
                else count++;
            }
            arr4[arr2[a-1]]=Math.max(arr4[arr2[a-1]],count);
            int ans=0;
            for(int i=0;i<=2*a;i++){
                ans=Math.max(ans,arr3[i]+arr4[i]);
            }
            System.out.println(ans);
        }
    }
}
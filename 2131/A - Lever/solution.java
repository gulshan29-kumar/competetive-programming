import java.util.*;
 
public class god {
 
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int arr1[]=new int[a];
            int arr2[]=new int[a];
            for(int i=0;i<a;i++){
                arr1[i]=in.nextInt();
            }
            for(int i=0;i<a;i++){
                arr2[i]=in.nextInt();
            }
            int ans=1;
            for(int i=0;i<a;i++){
                if(arr1[i]-arr2[i]>0) ans+=arr1[i]-arr2[i];
            }
            System.out.println(ans);
        }
    }
}
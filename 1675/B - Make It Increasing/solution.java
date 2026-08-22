import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int arr[]=new int[a];
            for(int i=0;i<a;i++) arr[i]=in.nextInt();
            int ans=0;
            for(int i=a-2;i>=0;i--){
                while(arr[i]>=arr[i+1]&&arr[i]>0){
                    arr[i]/=2;
                    ans++;
                }
                if(arr[i]==arr[i+1]) {
                    ans=-1;break;
                }
            }
            System.out.println(ans);
        }
    }
}
import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a=in.nextInt();
            int arr[]=new int[a];
            int ans=1;
            for(int i=0;i<a;i++){
                arr[i]=in.nextInt();}
            int max=0;
            for(int i=0;i<a;i++){
                if(arr[max]<arr[i]) max=i;
                if(i<a-1&&arr[i]==arr[i+1]) ans++;
            }
            if(ans==a) System.out.println("No");
            else{
                System.out.println("Yes");
               for(int i=0;i<a;i++){
                   if(i!=max) System.out.print(1+" ");
                   if(i==max) System.out.print(2+" ");
               }
                System.out.println();
            }
        }
    }
}
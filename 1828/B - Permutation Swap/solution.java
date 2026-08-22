import java.util.*;
public class qwe{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int arr[]=new int[a];
            for(int i=0;i<a;i++){
                arr[i]=in.nextInt();
            }
            int ans=0;
            for(int i=0;i<a;i++){
                ans=gcd(ans,Math.abs(arr[i]-(i+1)));
            }
            System.out.println(ans);
 
        }
    }
     static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
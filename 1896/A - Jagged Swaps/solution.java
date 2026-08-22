import java.util.*;
 
public class question {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0) {
            int a = in.nextInt();
            int arr[] = new int[a];
            for (int i = 0; i < a; i++) {
                arr[i] = in.nextInt();
            }
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<a;i++){
                if(arr[i]>max) max=arr[i];
                if(arr[i]<min) min=arr[i];
            }
            if(arr[0]>min) System.out.println("NO");
            else System.out.println("Yes");
 
        }
 
    }
}
 
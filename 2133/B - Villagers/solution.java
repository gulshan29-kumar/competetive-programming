import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            long arr[]=new long[a];
            for (int i = 0; i < a; i++) {
                arr[i] = in.nextLong();
            }
           long sum=0;
            Arrays.sort(arr);
            if(a%2==0){
            for(int i=0;i<a;i++){
                if(i%2!=0) sum+=arr[i];
            }}
            else{
                for(int i=0;i<a;i++){
                    if(i%2==0) sum+=arr[i];
                }
            }
            System.out.println(sum);
        }
    }
}
import java.util.*;
public class question{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            long a=in.nextLong();
            long b=in.nextLong();
            int c=in.nextInt();
            long[] arr=new long[c];
            for(int i=0;i<c;i++){
                arr[i]=in.nextLong();
            }
          long sum=b;
            for(int i=0;i<c;i++){
               sum+=Math.min(a-1,arr[i]);
            }
            System.out.println(sum);
        }
    }
}
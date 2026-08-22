import java.util.*;
public class qwe{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            int cnt1=0;
            int cnt2=0;
            for(int i=0;i<a;i++) {
                int d = in.nextInt();
                if (d <= b) cnt1++;
                if (d <= c) cnt2++;
            }
            int min=Math.min(cnt1,cnt2);
            int sum=min+Math.min(min,Math.abs(cnt1-cnt2));
            System.out.println(sum/2);
        }
    }
}
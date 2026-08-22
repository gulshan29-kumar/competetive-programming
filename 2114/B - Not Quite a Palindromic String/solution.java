import java.util.*;
public class qwe{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            String str=in.next();
            int count1=0;
            for(int i=0;i<a;i++){
                if(str.charAt(i)=='1') count1++;
            }
            int count0=a-count1;
            while(b!=0){
                if(count0>count1) count0-=2;
                else count1-=2;
                b--;
            }
            if(count0==count1) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
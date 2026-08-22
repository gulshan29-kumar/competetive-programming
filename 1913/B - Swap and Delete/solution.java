import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            String str=in.next();
            int a=str.length();
            int cnt1=0;
            int cont1=0;
            int ans0=0;
            for(int i=0;i<a;i++){
                if(str.charAt(i)=='1') {
                    cnt1++;
                }
            }
            int cnt0=a-cnt1;
            int ans=0;
           for(int i=0;i<=a;i++){
               if(i==a||str.charAt(i)=='0'){
                   if(cnt1==0||i==a) {ans=a-i;break;}
                   else cnt1--;
               }
               else {
                   if(cnt0==0||i==a) {ans=a-i;break;}
                   else cnt0--;
               }
           }
            System.out.println(ans);
 
 
        }
    }
}
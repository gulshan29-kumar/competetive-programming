import java.util.*;
public class question{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int d=in.nextInt();
            String a=in.next();
            int ans=0;
            int renew=1;
            if(d==1) System.out.println(2);
            else{
            for(int i=0;i<d-1;i++){
                if(a.charAt(i)==a.charAt(i+1)) renew++;
                else{
                    ans=Math.max(ans,renew);
                    renew=1;
                }
            }ans=Math.max(ans,renew);
            System.out.println(ans+1);
            }
 
        }
    }
}
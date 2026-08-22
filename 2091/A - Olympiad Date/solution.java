import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int ac0=3; int re0=0;
            int ac1=1; int re1=0;
            int ac2=2; int re2=0;
            int ac5=1; int re5=0;
            int ac3=1;  int re3=0;
            int bool=0;
            int ans=0;
            for(int i=1;i<=a;i++){
                int c=in.nextInt();
                if(c==0) re0++;
                else if(c==1) re1++;
                else if(c==2) re2++;
                else if(c==3) re3++;
                else if(c==5) re5++;
                if(re0>=ac0&&re1>=ac1&&re2>=ac2&&re3>=ac3&&re5>=ac5&&bool==0){
                    bool=1;
                    ans=i;
 
                }
            }
            if(bool!=1) System.out.println(0);
            else System.out.println(ans);
 
 
        }
    }
}
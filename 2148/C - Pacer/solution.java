import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int preva=0;
            int prevb=0;
            int currenta=0;
            int currentb=0;
            int ans=0;
            for(int i=0;i<a;i++){
                currenta=in.nextInt();
                currentb=in.nextInt();
                if(currentb!=prevb) {
                    ans+=1;
                    int d=currenta-preva-1;
                    if(d%2==0) ans+=d;
                    else ans+=d-1;
                }
                else{
                    int d=currenta-preva;
                    if(d%2==0) ans+=d;
                    else ans+=d-1;
                }
                preva=currenta;
                prevb=currentb;
            }
            if(b-currenta>0) ans+=b-currenta;
            System.out.println(ans);
        }
    }
 
}
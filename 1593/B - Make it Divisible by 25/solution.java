import java.util.*;
public class god{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            String str=in.next();
            int first0=-1;
            int second0=-1;
            int pos2=-1;
            int pos5=-1;
            int pos7=-1;
            int ans=str.length();
            for(int i=0;i<str.length();i++) {
                if(str.charAt(i)=='0'){
                    second0=first0;
                    first0=i;
                    if(second0>=0&&first0>=0) ans=Math.min(ans,first0-second0-1+str.length()-i-1);
                    if(pos5>=0) ans=Math.min(ans,first0-pos5-1+str.length()-i-1);
                }
                else if(str.charAt(i)=='5') {
                    pos5=i;
                    if(pos2>=0){
                        ans=Math.min(ans,pos5-pos2-1+str.length()-i-1);
                    }
                    if(pos7>=0){
                        ans=Math.min(ans,pos5-pos7-1+str.length()-i-1);
                    }
                }
                else if(str.charAt(i)=='2') pos2=i;
                else if(str.charAt(i)=='7') pos7=i;
            }
            System.out.println(ans);
        }
    }
}
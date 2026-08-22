import java.util.*;
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            String stra=in.next();
            String strb=in.next();
            int prefix0[]=new int[a+1];
            prefix0[0]=0;
            int prefix1[]=new int[a+1];
            prefix1[0]=0;
            for(int i=1;i<=a;i++){
                if(stra.charAt(i-1)=='1') {
                    prefix1[i]=1+prefix1[i-1];
                    prefix0[i]=prefix0[i-1];
                }
                else {
                    prefix1[i] = prefix1[i - 1];
                    prefix0[i] = 1 + prefix0[i - 1];
                }
            }
            int idx=a-1;
            while(idx>=0&&stra.charAt(idx)==strb.charAt(idx)) idx--;
            int count=-1;
            boolean bool=true;
            int i=idx;
            while(i>=0){
                if(count==-1&&stra.charAt(i)!=strb.charAt(i)&&prefix1[i+1]==prefix0[i+1]){
                    count=0;
                    while(i>=0&&stra.charAt(i)!=strb.charAt(i)) i--;
                }
                else if(count==0&&stra.charAt(i)== strb.charAt(i)&&prefix1[i+1]==prefix0[i+1]){
                    while(i>=0&&stra.charAt(i)==strb.charAt(i)) i--;
                    count=-1;
                    continue;
                }
                else{
                    bool=false;
                    break;
                }
            }
            if(bool) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
           int a=in.nextInt();
           String str=in.next();
           int idx=0, idx1=a-1;
           while(idx<idx1){
               if(str.charAt(idx)==str.charAt(idx1)) {
                   idx++;
                   idx1--;
               }
               else break;
           }
           if(idx==idx1) {
               System.out.println(0);
               continue;
           }
           int max=Math.min(fun(str,idx,idx1,str.charAt(idx)),fun(str,idx,idx1,str.charAt(idx1)));
           if(max==Integer.MAX_VALUE) System.out.println(-1);
           else System.out.println(max);
           }
        }
    static int fun(String str,int idx1,int idx2, Character ch){
        int bool=0;
        int count=0;
        while(idx1<idx2){
            if(str.charAt(idx1)==str.charAt(idx2)){
                idx1++;idx2--;
            }
            else if(str.charAt(idx1)==ch){idx1++;count++;
            }
            else if(str.charAt(idx2)==ch) {
                count++;idx2--;
            }
            else {
                return Integer.MAX_VALUE;
            }
        }
        return count;
    }
}
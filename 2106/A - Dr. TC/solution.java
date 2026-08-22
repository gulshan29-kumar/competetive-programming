import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            StringBuilder str=new StringBuilder(in.next());
            long count = str.chars().filter(ch -> ch == '1').count();
            int ans=0;
            for(int i=0;i<a;i++){
                if(str.charAt(i)=='1') ans+=count-1;
                else ans+=count+1;
            }
            System.out.println(ans);
        }
    }
}
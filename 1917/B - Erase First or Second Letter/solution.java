import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0) {
            int a=in.nextInt();
            String str=in.next();
            int ans=0;
            Set<Character> set=new HashSet<>();
            int it=0;
            for(int i=0;i<a;i++){
                if(set.contains(str.charAt(i))) ans=ans+it;
                else{
                    it++;
                    ans+=it;
                    set.add(str.charAt(i));
                }
            }
            System.out.println(ans);
        }
 
    }
}
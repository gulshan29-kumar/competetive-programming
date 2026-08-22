import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
           int a=in.nextInt();
           String str=in.next();
           int pref[]=new int[a];
           Set<Character> set1=new HashSet<>();
           set1.add(str.charAt(0));
           pref[0]=1;
           int suff[]=new int[a];
           Set<Character> set2=new HashSet<>();
           set2.add(str.charAt(a-1));
           suff[a-1]=1;
           for(int i=1;i<a;i++){
               if(set1.contains(str.charAt(i))) pref[i]=pref[i-1];
               else {
                   pref[i]=pref[i-1]+1;set1.add(str.charAt(i));
               }
 
           }
           for(int i=a-2;i>=0;i--){
               if(set2.contains(str.charAt(i))) suff[i]=suff[i+1];
               else {
                   suff[i]=suff[i+1]+1;set2.add(str.charAt(i));
               }
           }
           int ans=2;
           for(int i=0;i<a-1;i++){
               ans=Math.max(ans,pref[i]+suff[i+1]);
           }
 
            System.out.println(ans);
        }
    }
}
import java.util.*;
 
public class question {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0) {
            int a = in.nextInt();
           HashMap<Integer,Integer> map=new HashMap<>();
           int max=1;
           for(int i=0;i<a;i++){
               int h =in.nextInt();
               if(map.containsKey(h)){
                   map.put(h,map.get(h)+1);
                   max=Math.max(max,map.get(h));
               }
               else map.put(h,1);
           }
           int b=0;
           if(map.size()>2) System.out.println("NO");
           else {
               if(a%2==0){
               for (int it : map.keySet()) {
                   if (map.get(it)!=max) b=1;
               }
 
           }
               else {
                   for (int it : map.keySet()) {
                       if (map.get(it)<max-1) b=1;
               }
           }
               if(b==1) System.out.println("No");
               else System.out.println("Yes");
        }
        }
 
    }
}
 
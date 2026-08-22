import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            Map<Integer,Integer> map=new HashMap<>();
            long ans=0;
            for(int i=0;i<a;i++){
                int c=in.nextInt()-i;
                if(map.containsKey(c)){
                    ans+=map.get(c);
                    map.put(c,map.get(c)+1);
                }
                else map.put(c,1);
            }
            System.out.println(ans);
        }
    }
}
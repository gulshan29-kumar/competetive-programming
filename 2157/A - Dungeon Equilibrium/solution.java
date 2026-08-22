import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<a;i++){
                int c=in.nextInt();
                map.put(c, map.getOrDefault(c,0)+1);
            }
            int count=0;
            for(int it:map.keySet()){
                if(it>map.get(it)) count+=map.get(it);
                else if(map.get(it)>it) count+=(map.get(it)-it);
            }
            System.out.println(count);
 
        }
    }
}
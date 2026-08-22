import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            Map<Integer,Integer> map=new HashMap<>();
            map.put(0,-1);
            int len=-1;
            int sum=0;
            for(int i=0;i<a;i++){
                int c=in.nextInt();
                sum+=c;
                if(map.containsKey(sum-b)){
                    len=Math.max(len,i- map.get(sum-b));
                }
                if(!map.containsKey(sum)){
                    map.put(sum,i);
                }
            }
            if(len==-1) System.out.println(-1);
            else System.out.println(a-len);
        }
    }
}
 
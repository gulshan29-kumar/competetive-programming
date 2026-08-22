import java.util.*;
import java.io.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            long pow=in.nextLong();
            ArrayList<List<Long>> lst=new ArrayList<>();
            for(int i=1;i<=n;i++){
                List<Long> list=new ArrayList<>();
                long c=in.nextLong();
                if(c%pow==0) list.add(c%pow);
                else list.add(pow-c%pow);
                list.add((long)(i));
                lst.add(list);
            }
 
            Collections.sort(lst, (x, y) -> Long.compare(x.get(0), y.get(0)));
            for(int i=0;i<n;i++){
                System.out.print(lst.get(i).get(1)+" ");
            }
            System.out.println();
        }
    }
}
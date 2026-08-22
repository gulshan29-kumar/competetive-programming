import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t= in.nextInt();
        while(t-->0){
            int a= in.nextInt();
            char ch = in.next().charAt(0);
            String str=in.next();
            ArrayList<Integer> agic=new ArrayList<>();
            ArrayList<Integer> agc=new ArrayList<>();
            for(int i=0;i<a;i++){
                if(str.charAt(i)==ch) agic.add(i);
                if(str.charAt(i)=='g') agc.add(i);
            }
 
            int max=0;
            for(int i=0;i<agic.size();i++){
                if(agic.get(i)>agc.get(agc.size()-1)) max=Math.max(max,agc.get(0)+str.length()-agic.get(i));
                else{
                    int cur = agic.get(i);
 
                    // find next 'g'
                    int pos = Collections.binarySearch(agc, cur);
 
                    if(pos < 0) pos = -pos - 1;// next greater
                    max = Math.max(max, agc.get(pos) - cur);
                }
            }
            System.out.println(max);
 
        }
    }
}
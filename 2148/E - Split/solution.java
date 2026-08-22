import java.util.*;
public class qwe{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt(),k=in.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++) arr[i]=in.nextInt();
            Map<Integer,Integer> tot=new HashMap<>();
            for(int v:arr) tot.put(v,tot.getOrDefault(v,0)+1);
            boolean bad=false;
            for(int v:tot.keySet()){
                if(tot.get(v)%k!=0){ System.out.println(0); bad=true; break; }
            }
            if(bad) continue;
            Map<Integer,Integer> max=new HashMap<>();
            for(int v:tot.keySet()) max.put(v,tot.get(v)/k);
            long ans=0;
            Map<Integer,Integer> freq=new HashMap<>();
            int left=0;
            for(int right=0;right<n;right++){
                int val=arr[right];
                freq.put(val,freq.getOrDefault(val,0)+1);
                while(freq.get(val)>max.get(val)){
                    int lv=arr[left++];
                    freq.put(lv,freq.get(lv)-1);
                }
                ans+=right-left+1;
            }
            System.out.println(ans);
        }
    }
}
import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        long k=in.nextLong();
        long x=in.nextLong();
        long arr[]=new long[a];
 
        for(int i=0;i<a;i++){
            arr[i]=in.nextLong();
        }
        Arrays.sort(arr);
 
        ArrayList<Long> diff=new ArrayList<>();
 
        for(int i=1;i<a;i++){
            long d = arr[i] - arr[i-1];
            if(d > x){
                // correct formula
                long need = (d-1)/x;
                diff.add(need);
            }
        }
 
        if(diff.size()==0){
            System.out.println(1);
            return;
        }
 
        Collections.sort(diff);
 
        int idx=0;
        while(idx < diff.size() && k >= diff.get(idx)){
            k -= diff.get(idx);
            idx++;
        }
 
        System.out.println(diff.size() - idx + 1);
    }
}
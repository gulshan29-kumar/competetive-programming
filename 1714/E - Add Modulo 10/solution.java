import java.util.*;
import java.io.*;
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            long[] arr=new long[a];
            for(int i=0;i<a;i++) arr[i]=in.nextLong();
            int bool=0;
            for(int i=0;i<a;i++){
                if(arr[i]%5==0) {
                    bool=1;
                    break;
                }
            }
            Set<Long> set=new HashSet<>();
            if(bool==1){
                for(int i=0;i<a;i++){
                    if(arr[i]%10==0) {
                        set.add(arr[i]);
                        continue;
                    }
                    set.add(arr[i]+5);
 
                }
            }
            else{
                for(int i=0;i<a;i++){
                    while(arr[i]%10!=2){
                        arr[i]=arr[i]+arr[i]%10;
                    }
                    set.add(arr[i]%20);
                }
            }
            if(set.size()==1) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
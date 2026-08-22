import java.io.*;
import java.util.*;
 
public class qwe {
    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            String str=in.next();
            Boolean arr[]=new Boolean[a];
            Arrays.fill(arr,false);
            long ans=0;
            for(int i=1;i<=a;i++){
                for(int j=i;j<=a;j+=i){
                    if(str.charAt(j-1)=='1') break;
                    if(arr[j-1]) continue;
                    else {
                        ans+=i;
                        arr[j-1]=true;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
 
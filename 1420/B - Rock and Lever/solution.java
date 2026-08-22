import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            long arr[]=new long[a];
           for(int i=0;i<a;i++){
               arr[i]=(long)(Math.log(in.nextLong())/Math.log(2));
           }
           Arrays.sort(arr);
           int lastidx=0;
           long ene=arr[0];
           long ans=0;
           for(int i=1;i<a;i++){
               if(arr[i]==ene){
                   ans+=i-lastidx;
               }
               else{
                   lastidx=i;
                   ene=arr[i];
               }
           }
            System.out.println(ans);
        }
    }
}
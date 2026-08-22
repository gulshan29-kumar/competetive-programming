import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
           int a=in.nextInt();
           long req=in.nextLong();
           long arr[]=new long[a];
           Set<Long> set=new HashSet<>();
           for(int i=0;i<a;i++) {
               arr[i]=in.nextLong(); set.add(arr[i]);
           }
           int bool=0;
           for(int i=0;i<a;i++){
               if(set.contains(arr[i]-req)){
                   bool=1;break;
               }
           }
           if(bool==1) System.out.println("Yes");
           else System.out.println("No");
 
        }
    }
}
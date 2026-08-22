import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int arr[]=new int[a];
            for(int i=0;i<a;i++) arr[i]=in.nextInt();
            Set<Integer> set=new HashSet<>();
            int first=0;
            for(int i=0;i<a;i++){
                if((i&arr[i])!=i) {
                    first=arr[i];
                    set.add(arr[i]);
                }
            }
 
            for(int it:set){
                first=first&it;
            }
            System.out.println(first);
        }
    }
}
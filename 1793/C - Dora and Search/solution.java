import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
         int a=in.nextInt();
         int arr[]=new int[a];
         for(int i=0;i<a;i++) arr[i]=in.nextInt();
         TreeSet<Integer> set=new TreeSet<>();
         for(int it:arr) set.add(it);
         int i=0;int j=a-1;
         while(i<j){
             if(minormax(arr[i],set)){
                 set.remove(arr[i]);
                 i++;
                 continue;
             }
             if(minormax(arr[j],set)){
                 set.remove(arr[j]);
                 j--;
                 continue;
             }
             break;
         }
         if(i==j) System.out.println(-1);
         else System.out.println(++i+" "+ ++j);
 
        }
    }
    static Boolean minormax(int val,Set<Integer> set){
        if(set.iterator().next()==val) return true;
        if(((TreeSet<Integer>) set).last()==val) return true;
        return false;
    }
}
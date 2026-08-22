import java.util.*;
public class qwe {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int t=in.nextInt();
     while(t-->0){
         int a=in.nextInt();
         Set<Integer> set=new HashSet<>();
         for(int i=0;i<a;i++){
             set.add(in.nextInt());
         }
 
         System.out.println(set.size()*2-1);
     }
    }
}
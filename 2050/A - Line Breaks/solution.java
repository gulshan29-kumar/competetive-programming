import java.util.*;
public class god {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt();
      while(t-->0){
         int a=in.nextInt() ;
         int b=in.nextInt();
         String[] arr=new String[a];
         for(int i=0;i<a;i++){
             arr[i]=in.next();
         }
         int count=arr[0].length();
         int index=0;
         while(index<a&&count<b){
                 index++;
              if(index<a) count+=arr[index].length();
         }
         if(count==b) System.out.println(index+1);
          else System.out.println(index);
        }
    }
 
}
 
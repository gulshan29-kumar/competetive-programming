import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int arr[]=new int[a];
            for(int i=0;i<a;i++){
                arr[i]=in.nextInt();
            }
            int boo=1;
            int min=Integer.MAX_VALUE;
            for(int i=1;i<a;i++){
                min=Math.min(Math.max(2*arr[i-1]-1,arr[i-1]),min);
              if(min<arr[i]){
                  boo=0;
                  break;
              }
            }
            if(boo==0) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}
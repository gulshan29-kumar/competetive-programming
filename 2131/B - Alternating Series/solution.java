import java.util.*;
 
public class god {
 
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
           for(int i=1;i<a;i++){
               if(i%2!=0) System.out.print(-1+" ");
               else System.out.print(3+" ");
           }
           if(a%2==0) System.out.print(2+" ");
           else System.out.print(-1+" ");
           System.out.println();
        }
    }
}
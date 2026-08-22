import java.util.*;
 
public class question{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
           if(a%2==0) System.out.println(-1);
           else{
               for(int i=1;i<=a;i++){
                   if(i>a/2) System.out.print(i-a/2+" ");
                   else System.out.print(a-i+1+" ");
               }
               System.out.println();
           }
        }
    }
}
import java.util.*;
 
public class question {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            if(a>=5){
           for(int i=2;i<=a;i=i+2){
               if(i==4) continue;
                System.out.print(i+" ");
            }
            System.out.print(4+" ");
            System.out.print(5+" ");
            for(int i=1;i<=a;i+=2){
                if(i==5) continue;
                System.out.print(i+" ");
            }
            }
            else System.out.print(-1);
            System.out.println( );
 
        }
    }
}
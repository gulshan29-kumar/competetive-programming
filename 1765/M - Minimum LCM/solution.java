import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            long a=in.nextLong();
             long k=1;
            for(int i=2;i*i<=a;i++){
                if(a%i==0){
                    k=a/i;
                    break;
                }
            }
            System.out.println(k+" "+(a-k));
 
        }
    }
}
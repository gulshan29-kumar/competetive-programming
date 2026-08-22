import java.util.*;
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            long a=in.nextLong();
            while(!fair(a)) a=a+1;
            System.out.println(a);
        }
    }
    static Boolean fair(long no){
        long no1=no;
        while(no!=0){
            long n=no%10;
            if(n!=0&&no1%n!=0) return false;
            no/=10;
        }
        return true;
    }
}
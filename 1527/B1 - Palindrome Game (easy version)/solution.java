import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            String str=in.next();
            int count=0;
            for(int i=0;i<a;i++){
                if(str.charAt(i)=='0') count++;
            }
            if(count==1) System.out.println("BOB");
            else if(count%2==1) System.out.println("ALICE");
            else System.out.println("BOB");
        }
    }
}
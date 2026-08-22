import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            String str=in.next();
            int count1=0;
            for(int i=0;i<a;i++){
                if(str.charAt(i)=='1') count1++;
            }
            if(count1<=b||2*b>a) System.out.println("Alice");
            else System.out.println("bob");
        }
    }}
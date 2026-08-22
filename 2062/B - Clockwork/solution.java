import java.util.*;
 
public class god {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int t=in.nextInt();
    while(t-->0){
        int a=in.nextInt();
        long arr[]=new long[a];
        for(int i=0;i<a;i++){
            arr[i]=in.nextLong();
        }
        long max=a;
        int b=0;
        for(int i=0;i<a;i++){
            max--;
            if(arr[i]-2*Math.max(max,a-max-1)<=0){
                b=1;
                break;
            }
        }
        if(b!=1) System.out.println("Yes");
        else System.out.println("NO");
    }
 
    }
}
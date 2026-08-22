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
 
            long so=0;
            long se=0;
            for(int i=0;i<a;i++) {
                if(i%2==0) se+=arr[i];
                else so+=arr[i];
            }
            long sio=a/2;
            long sie=(a+1)/2;
            if(so/sio==se/sie && so%sio==0 &&se%sie==0) System.out.println("Yes");
            else System.out.println("No");
        }
    }
 
}
 
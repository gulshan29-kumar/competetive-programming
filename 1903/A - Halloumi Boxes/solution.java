import java.util.*;
public class god {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int[] arr=new int[a];
            for(int i=0;i<a;i++){
                arr[i]=in.nextInt();
            }
            int count=0;
 
            for(int i=0;i<a-1;i++){
                if(arr[i]>arr[i+1]){
                    count=1;
                    break;
                }
            }
            if(b>=2) System.out.println("Yes");
            else if(b==1&&count==0) System.out.println("Yes");
            else System.out.println("No");
        }
    }
 
}
 
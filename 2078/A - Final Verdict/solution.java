import java.util.*;
public class qwe{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int arr[]=new int[a];
            int count =0;
            for(int i=0;i<a;i++){
                arr[i]=in.nextInt();
            }
            for(int i=0;i<a;i++){
              count+=arr[i];
            }
            if(count/a==b&&count%a==0) System.out.println("Yes");
            else System.out.println("No");
        }
    }
 
}
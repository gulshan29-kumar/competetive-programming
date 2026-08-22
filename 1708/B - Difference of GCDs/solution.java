import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            long min=in.nextLong();
            long b=in.nextLong();
            long arr[]=new long[a+1];
            long max=0;
            for(int i=1;i<=a;i++){
                arr[i]=min%i==0?min:(min/i+1)*i;
                max=Math.max(max,arr[i]);
            }
            if(max>b) System.out.println("No");
            else{
                System.out.println("Yes");
                for(int i=1;i<=a;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
}
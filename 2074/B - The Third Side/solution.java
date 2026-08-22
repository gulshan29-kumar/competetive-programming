import java.util.*;
public class question{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int arr[]=new int[a];
            for(int i=0;i<a;i++){
                arr[i]=in.nextInt();
            }
            Arrays.sort(arr);
            int sum=arr[0];
            for(int i=1;i<a;i++){
                sum+=arr[i]-1;
            }
            System.out.println(sum);
        }
    }
}
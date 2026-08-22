import java.util.*;
 
public class question{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int arr[]=new int[101];
            int c;
            for(int i=0;i<a;i++){
                c=in.nextInt();
                arr[c]++;
            }
            Arrays.sort(arr);
            System.out.println(a-arr[100]);
        }
    }
}
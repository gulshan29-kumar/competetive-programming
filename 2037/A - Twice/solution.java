import java.util.*;
 
public class question {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a =in.nextInt();
            int[] arr=new int[a];
            for(int i=0;i<a;i++){
                arr[i]=in.nextInt();
            }
           int arr1[]=new int[a+1];
            for(int i=0;i<a;i++){
                arr1[arr[i]]++;
            }
            int max=0;
            for(int i=0;i<=a;i++){
                max=max+arr1[i]/2;
            }
            System.out.println(max);
        }
    }
}
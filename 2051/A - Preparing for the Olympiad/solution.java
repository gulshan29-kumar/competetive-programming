import java.util.*;
 
public class question {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       long x=in.nextInt();
       for(int i=1;i<=x;i++){
           int a=in.nextInt();
           int arr1[]=new int[a];
           int arr2[]=new int[a];
           for(int j = 0; j <a; j++){
               arr1[j]=in.nextInt();
           }
           for(int j = 0; j <a; j++){
               arr2[j]=in.nextInt();
           }
           int sum=0;
           for(int k = 0; k <a-1; k++){
               if(arr1[k]>arr2[k+1]) sum+=arr1[k]-arr2[k+1];
           }
           System.out.println(sum+arr1[a-1]);
 
       }
    }
}
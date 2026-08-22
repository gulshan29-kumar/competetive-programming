import java.util.*;
public class question{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int arr1[]=new int[a];
            int arr2[]=new int[a];
            for(int i=0;i<a;i++){
                arr1[i]=in.nextInt();
            }
            for(int i=0;i<a;i++){
                arr2[i]=in.nextInt();
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int max1=1;
            int max2=1;
            for(int i=0;i<a-1;i++){
                if(arr1[i]!=arr1[i+1]) max1++;
            }
            for(int i=0;i<a-1;i++){
                if(arr2[i]!=arr2[i+1]) max2++;
            }
            if(max1<=2&&max2==1) System.out.println("No");
            else if(max1==1&&max2<=2) System.out.println("No");
            else if(max1==1&&max2==1) System.out.println("No");
            else System.out.println("Yes");
        }
      }
 
}
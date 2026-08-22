import java.util.*;
public class question{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int arr[]=new int[a];
            int arr1[]=new int[1010];
            for(int i=0;i<a;i++){
                arr[i]=in.nextInt();
                arr1[arr[i]]++;
            }
            for(int i=0;i<1010;i++){
                if(arr1[i]>2){
                    arr1[i+1]+=arr1[i]-2;
                    arr1[i]=2;
                }
            }
            int b=0;
            for(int i=0;i<1010;i++){
                if(arr1[i]%2!=0) {
                    b = 1;
                    break;
                }
            }
            if(b==0) System.out.println("Yes");
            else System.out.println("NO");
        }
    }
}
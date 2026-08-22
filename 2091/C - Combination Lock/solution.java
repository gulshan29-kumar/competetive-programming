import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int arr[]=new int[a];
 
            for(int i=0;i<(a%2!=0?a/2+1:a/2);i++){
                arr[i]=2*i+1;
            }
            int p=1;
            for(int i=(a%2!=0?a/2+1:a/2);i<a;i++){
                  arr[i]=2*(p++);
            }
            int count=0;
            for(int i=0;i<a;i++){
                if(arr[i]==i+1) count++;
            }
            if(count>1) System.out.println(-1);
            else {
                for(int i=0;i<a;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
}
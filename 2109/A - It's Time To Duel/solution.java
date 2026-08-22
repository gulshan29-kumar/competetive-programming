import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int arr[]=new int[a];
            int one=0;
            int cont=0;
            for(int i=0;i<a;i++){
                arr[i]=in.nextInt();
                if(arr[i]==1) one++;
            }
            for(int i=0;i<a-1;i++){
                if(arr[i]==0&&arr[i+1]==0) cont++;
            }
            if(cont>0||one==a) System.out.println("Yes");
            else System.out.println("No");
 
 
        }
    }
}
 
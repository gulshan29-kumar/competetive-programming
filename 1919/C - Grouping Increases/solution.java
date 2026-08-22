import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int arr[]=new int[a];
            for(int i=0;i<a;i++) arr[i]=in.nextInt();
            int t1=Integer.MAX_VALUE;
            int t2=Integer.MAX_VALUE;
            int ans=0;
            for(int i=0;i<a;i++){
                if (t1 > t2) {
                    int temp = t1;
                    t1 = t2;
                    t2 = temp;
                }
                if(t1>=arr[i]) t1=arr[i];
                else if(t2>=arr[i]) t2=arr[i];
                else{
                    ans++;
                    t1=arr[i];
                }
            }
            System.out.println(ans);
        }
    }
}
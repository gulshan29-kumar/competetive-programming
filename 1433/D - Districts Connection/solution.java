import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int arr[]=new int[a];
            int idx1=0;
            int idx2=-1;
            for(int i=0;i<a;i++) {
                arr[i]=in.nextInt();
                if(arr[i]!=arr[idx1]&&idx2==-1) idx2=i;
            }
            if(idx2==-1){
                System.out.println("No");
                continue;
            }
            System.out.println("Yes");
            for(int i=1;i<a;i++){
                if(arr[i]!=arr[idx1]){
                    System.out.println((idx1+1)+" "+(i+1));
                }
                else System.out.println((idx2+1)+" "+(i+1));
            }
        }
    }
}
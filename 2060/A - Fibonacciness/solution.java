import java.util.*;
public class god {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
 
            int arr[]=new int[5];
            for(int i=0;i<5;i++){
                if(i!=2)arr[i]=in.nextInt();
            }
            int count1=0;
            int count2=0;
            arr[2]=arr[0]+arr[1];
            for(int i=2;i<5;i++){
                if(arr[i]==arr[i-1]+arr[i-2] )count1++;
            }
            arr[2]=arr[3]-arr[1];
            for(int i=2;i<5;i++){
                if(arr[i]==arr[i-1]+arr[i-2]) count2++;
            }
            System.out.println(Math.max(count1,count2));
        }
    }
 
}
 
import java.util.*;
public class god{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int arr[]=new int[a];
            for(int i=0;i<a;i++){
                arr[i]=in.nextInt();
            }
            int ans1=-1;
            int ans2=0;
            int ans3 =-1;
            int ans4=0;
            Arrays.sort(arr);
            if(arr[0]%2!=0&&arr[a-1]%2!=0) System.out.println(0);
            else if(arr[0]%2==0&&arr[a-1]%2==0) System.out.println(0);
            else{
                for(int i=0;i<a;i++){
                    if(ans1==-1&&arr[i]%2==0) ans1=i;
                    if(arr[i]%2==0) ans2=i;
                }
                for(int i=0;i<a;i++){
                    if(ans3==-1&&arr[i]%2!=0) ans3=i;
                    if(arr[i]%2!=0) ans4=i;
                }
                System.out.println(Math.min(a-(ans2-ans1+1),a-(ans4-ans3+1)));
            }
 
        }
    }
}
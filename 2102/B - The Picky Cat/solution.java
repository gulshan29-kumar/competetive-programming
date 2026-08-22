import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
          int a=in.nextInt();
          int arr[]=new int[a];
          for(int i=0;i<a;i++){
              arr[i]=Math.abs(in.nextInt());
          }
          int ans=arr[0];
          Arrays.sort(arr);
          int count=0;
          for(int i=0;i<a;i++){
              if(ans==arr[i]) break;
              count++;
          }
          if(count<=(a)/2) System.out.println("Yes");
          else System.out.println("No");
        }
    }
}
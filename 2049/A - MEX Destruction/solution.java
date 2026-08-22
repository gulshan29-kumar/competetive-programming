import java.util.*;
 
public class god {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int x=in.nextInt();
     for(int i=0;i<x;i++){
         int a=in.nextInt();
         int arr[]=new int[a];
         int sum=0;
         for(int j = 0; j <a; j++){
             arr[j]=in.nextInt();
 
     }
         int e=0;
         int c=1;
         int d=0; int f=0;int count=0;
         for(int j = 0; j <a; j++){
             if(arr[j]==0){
                 sum++;
                e=j;
 
             }
            if(arr[j]!=0&&c==1)
            {
                c++;
                d=j;
            }
             if(arr[j]!=0) f=j;
            if(e>d&&e<f){ count=1;break;}}
 
      if(count==1) System.out.println(2);
 
         else if(sum==a) System.out.println(0);
         else if(sum==0) System.out.println(1);
         else if(arr[0]==arr[a-1]&&arr[0]==0&&sum==2) System.out.println(1);
         else if((arr[0]==0||arr[a-1]==0)) System.out.println(1);
         else System.out.println(2);
     }
 
    }
}
 
 
 
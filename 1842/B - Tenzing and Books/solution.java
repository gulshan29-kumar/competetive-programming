import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int t=in.nextInt();
       while(t-->0){
           int a=in.nextInt();
           long req=in.nextLong();
           Long arr[][]=new Long[3][a];
           for(int i=0;i<3;i++){
               for(int j=0;j<a;j++){
                   arr[i][j]=in.nextLong();
               }
           }
           long ans=0;
           for(int i=0;i<3;i++){
               for(int j=0;j<a;j++){
                   if((req|arr[i][j])==req){
                       ans=ans|arr[i][j];
                   }
                   else break;
               }
           }
           if(ans==req) System.out.println("Yes");
           else System.out.println("No");
       }
    }
}
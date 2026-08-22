import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
           int a=in.nextInt();
           Character ch=in.next().charAt(0);
           String str=in.next();
           int count=-1;
           int cntch=0;
           for(int i=a-1;i>=0;i--){
               if(i>=a/2&&str.charAt(i)==ch){
                   count=i;
               }
               if(str.charAt(i)==ch) cntch++;
           }
           if(cntch==a) System.out.println(0);
           else if(count!=-1){
               System.out.println(1);
               System.out.println(count+1);
           }
           else {
               System.out.println(2);
               System.out.println((a-1)+" "+a);
           }
        }
    }
}
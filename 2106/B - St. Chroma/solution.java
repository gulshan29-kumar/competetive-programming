import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
           int a=in.nextInt();
           int b=in.nextInt();
           int size=0;
           for(int i=0;i<a;i++){
               if(i!=b){
                   System.out.print(i+" ");
                   size++;
               }
           }
           if(size!=a) System.out.print(b+" ");
           System.out.println();
        }
    }
}
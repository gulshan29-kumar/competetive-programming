import java.util.*;
public class question{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int c=in.nextInt();
            int[] arr=new int[c];
            for(int i=0;i<c;i++){
                arr[i]=in.nextInt();
            }
            int idx=-1;
            int max=0;
            for(int i=0;i<c;i++){
                if(arr[i]==0) {
                    idx = i;
                    max++;
                }
            }
            if(max==c) System.out.println(0);
            else  if(c%2==0) {
                System.out.println(2);
                System.out.println(1+" "+c);
                System.out.println(1+" "+c);
            }
           else{
                System.out.println(4);
                System.out.println(1+" "+(c-1));
                System.out.println(1+" "+(c-1));
                System.out.println(2+" "+c);
                System.out.println(2+" "+c);
            }
 
        }
    }
}
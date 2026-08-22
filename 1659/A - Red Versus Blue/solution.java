import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int red = in.nextInt();
            int blue = in.nextInt();
            StringBuilder sb=new StringBuilder();
            int spac=red/(blue+1);
            int extrar=red%(blue+1);
            int red1=0;
           for(int i=0;i<blue;i++){
               for (int k = 0; k < spac; k++) {
                   sb.append('R');
               }
               red1+=spac;
               sb.append('B');
               if(extrar-->0) {
                   sb.append('R');
                   red1++;
               }
           }
           while(red1++!=red) sb.append('R');
 
           System.out.println(sb);
        }
    }
}
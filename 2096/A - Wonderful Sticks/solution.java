import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        while (t-- > 0) {
            int a = in.nextInt();
            String str=in.next();
            int count1=0;
            int count2=0;
            for(int i=0;i<a-1;i++) {
                if (str.charAt(i) == '<') count1++;
                else count2++;
            }
            int min=a-count2;
            int max=a-count2+1;
            if(str.charAt(0)=='<') System.out.print(min--+" "+min--);
            else System.out.print(min--+" "+max++);
            for(int i=1;i<a-1;i++){
               if(str.charAt(i)=='<') System.out.print(" "+min--);
               else System.out.print(" "+max++);
            }
            System.out.println();
 
 
 
        }
    }
}
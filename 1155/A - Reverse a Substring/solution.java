import java.util.*;
public class qwe {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        String str=in.next();
        int idx1=-1;
        int idx2=-1;
        for(int i=1;i<a;i++){
            if(str.charAt(i)<str.charAt(i-1)){
                idx1=i-1;
                idx2=i;
                break;
            }
        }
        if(idx1==idx2) System.out.println("No");
        else {
            System.out.println("Yes");
            System.out.println((idx1+1)+" "+(idx2+1));
        }
}}
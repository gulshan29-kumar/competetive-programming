import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            String str=in.nextLine();
            String ans= ""+str.charAt(0);
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==' '&&i+1<str.length()){
                    ans= ans + str.charAt(i+1);
                }
            }
            System.out.println(ans);
        }
    }
}
import java.util.*;
public class god{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
            String a=in.next();
            String c=" ";
            for(int i=0;i<a.length();i++){
                if(i==0&&'9'-a.charAt(i)==0) c+=a.charAt(i);
               else if(a.charAt(i)>'4') c+='9'-a.charAt(i);
                else c+=a.charAt(i);
            }
            System.out.println(c);
 
    }
}
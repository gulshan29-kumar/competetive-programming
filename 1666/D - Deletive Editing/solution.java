import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
           String str1=in.next();
           String str2=in.next();
           Set<Character> set=new HashSet<>();
           int j=str2.length()-1;
           for(int i= str1.length()-1;i>=0;i--){
               if(j>=0&&str1.charAt(i)==str2.charAt(j)&&!(set.contains(str1.charAt(i)))){
                   j--;
               }
               else set.add(str1.charAt(i));
           }
           if(j==-1) System.out.println("Yes");
           else System.out.println("No");
 
        }
    }
}
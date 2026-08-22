import java.util.*;
public class question{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
           String str=in.next();
           char arr[]=new char[26];
           for(int i=0;i<a;i++){
               arr[str.charAt(i)-'a']++;
           }
           int min=0;
           for(int i=0;i<26;i++){
               if(arr[i]%2!=0) min+=arr[i]%2;
           }
           if(min-1<=b) System.out.println("Yes");
           else System.out.println("No");
 
        }
    }
}
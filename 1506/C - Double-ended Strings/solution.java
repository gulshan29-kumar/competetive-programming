import java.util.*;
 
public class qwe {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int t=in.nextInt();
    while(t-->0){
        String str1=in.next();
        String str2=in.next();
        int max=0;
        for(int k=0;k<str1.length();k++){
            for(int l=0;l<str2.length();l++){
                int i = k;
                int j = l;
 
                int count=0;
            while(i<str1.length()&&j<str2.length()&&str1.charAt(i)==str2.charAt(j)){
                    count++;
                    i++;j++;
                }
 
            max=Math.max(max,count);
        }
        }
        System.out.println(str1.length()+str2.length()-2*max);
    }
    }
}
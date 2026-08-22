import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            long a=in.nextInt();
            long b=in.nextInt();
            long count=0;
            long c=0;
                if((b&1)==1){
                    c=b;
                    b=b-1;
                }
                else{
                    c=b-1;
                    b=b;
                }
                if((a&1)==1&&a>b) {
                    count++;
                    count+=(a-c)/b;
                   if((a-c)%b !=0) count++;
 
                }
                else {
                    count+=a/b;
                    if(a%b!=0) count++;
                }
 
            System.out.println(count);
 
        }
    }
}
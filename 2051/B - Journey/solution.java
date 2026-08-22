import java.util.*;
 
public class god {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long x=in.nextInt();
        for(int i=1;i<=x;i++){
            int n=in.nextInt();
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            int sum=a+b+c;
            int d=n/sum;
            int count=d*3;
            n=n-d*sum;
            if(n>0){ count++;
                n=n-a;
            }
            if(n>0){ count++;
                n=n-b;
            }
            if(n>0){ count++;
                n=n-c;
            }
            System.out.println(count);
    }
}}
 